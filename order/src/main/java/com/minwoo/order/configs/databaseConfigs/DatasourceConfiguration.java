package com.minwoo.order.configs.databaseConfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.minwoo",
        entityManagerFactoryRef = "entityManager",
        transactionManagerRef = "customerTransactionManager")
@EnableTransactionManagement
public class DatasourceConfiguration {

    @Autowired(required = false)
    private PersistenceUnitManager persistenceUnitManager;

    @Autowired
    private DatabaseList databaseList;

    @Bean
    @Primary
    public DataSource clientDataSource() {
        DatasourceRouter router = new DatasourceRouter();
        final Map<Object, Object> map = getDataSources(databaseList.getDatabase());
        router.setTargetDataSources(map);
        return router;
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManager(
            final JpaProperties jpaProperties) {
        EntityManagerFactoryBuilder builder =
                createEntityManagerFactoryBuilder(jpaProperties);
        return builder.dataSource(clientDataSource()).packages("com.monkey.apiManagement")
                .persistenceUnit("entityManager").build();
    }

    @Bean
    @Primary
    public JpaTransactionManager customerTransactionManager(
            @Qualifier("entityManager") final EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }

    private EntityManagerFactoryBuilder createEntityManagerFactoryBuilder(
            JpaProperties jpaProperties) {
        JpaVendorAdapter jpaVendorAdapter =
                createJpaVendorAdapter(jpaProperties);
        return new EntityManagerFactoryBuilder(jpaVendorAdapter,
                jpaProperties.getProperties(), this.persistenceUnitManager);
    }

    private JpaVendorAdapter createJpaVendorAdapter(
            JpaProperties jpaProperties) {
        AbstractJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(jpaProperties.isShowSql());
        adapter.setDatabase(jpaProperties.getDatabase());
        adapter.setDatabasePlatform(jpaProperties.getDatabasePlatform());
        adapter.setGenerateDdl(jpaProperties.isGenerateDdl());
        return adapter;
    }

    private Map<Object, Object> getDataSources(List<Database> databases) {
        Map<Object, Object> map = new HashMap<>();
        databases.forEach(database -> {
            // getting devNumbers from jdbcUrl
            String devNumber = database.getJdbcUrl().split("=")[1].replaceAll("\\D+","");
            DataSource dataSource = DataSourceBuilder.create().url(database.getJdbcUrl())
                    .username(database.getUsername())
                    .password(database.getPassword())
                    .driverClassName(database.getDriverClassName())
                    .build();
            map.put(devNumber, dataSource);
        });
        return map;
    }
}
