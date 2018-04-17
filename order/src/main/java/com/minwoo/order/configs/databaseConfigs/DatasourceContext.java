package com.minwoo.order.configs.databaseConfigs;

public final class DatasourceContext {
    private static ThreadLocal<String> currentDatasource = new ThreadLocal<>();

    public static void setCurrentDatasource(String datasourceName) {
        currentDatasource.set(datasourceName);
    }

    public static String getCurrentDatasource() {
        return currentDatasource.get();
    }

    public static void clear() {
        currentDatasource.remove();
    }
}
