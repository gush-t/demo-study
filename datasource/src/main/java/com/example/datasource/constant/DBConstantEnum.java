package com.example.datasource.constant;

public enum DBConstantEnum {
    STUDENT("student"),WORKER("worker");

    private String datasource;

    DBConstantEnum(String datasource) {
        this.datasource = datasource;
    }

    public String getDatasource() {
        return datasource;
    }
}
