package com.minwoo.customer.databaseConfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "datasource")
public class DatabaseList {
    @Autowired
    private List<Database> database;

    protected DatabaseList() {}

    public List<Database> getDatabase() {
        return database;
    }

    public void setDatabase(List<Database> database) {
        this.database = database;
    }
}
