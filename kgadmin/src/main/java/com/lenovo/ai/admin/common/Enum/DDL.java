package com.lenovo.ai.admin.common.Enum;

public enum DDL {
    SELECT_DATABASES ("show databases");

    private String sentense;

    public String getSentense() {
        return sentense;
    }

    private DDL(String sentense) {
        this.sentense = sentense;
    }

}
