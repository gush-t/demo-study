package com.example.jdktest.entity;

import java.util.Date;


public class Worker {

    private Integer id;
    private String name;
    private boolean newWorker;

    private Date entryTime;

    public Worker() {
    }

    public Worker(String name, Integer id, boolean newWorker, Date entryTime) {
        this.name = name;
        this.id = id;
        this.newWorker = newWorker;
        this.entryTime = entryTime;
    }
}
