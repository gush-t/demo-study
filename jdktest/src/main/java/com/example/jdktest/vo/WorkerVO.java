package com.example.jdktest.vo;

import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Date;

public class WorkerVO  {

    /**
     * 权限修饰符
     * public  该类全部类都可以访问
     * protected 相同包下的无关类和子类，不同包下的之类可以访问，当前类
     * default 相同包下的无关类和子类，当前类
     * private 当前类
     */
    private String workerName;
    private boolean newWorker;
    private Date entryTime;

    public WorkerVO() {
    }



    public WorkerVO(String workerName, boolean newWorker, Date entryTime) {
        this.workerName = workerName;
        this.newWorker = newWorker;
        this.entryTime = entryTime;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public boolean isNewWorker() {
        return newWorker;
    }

    public void setNewWorker(boolean newWorker) {
        this.newWorker = newWorker;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
