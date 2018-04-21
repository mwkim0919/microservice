package com.minwoo.customer.databaseConfigs;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public final class DatasourceRouter extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DatasourceContext.getCurrentDatasource();
    }
}
