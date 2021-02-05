package com.example.jdktest.entity;

import com.fasterxml.jackson.databind.ser.Serializers;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Worker implements Serializable {

    private Integer id;
    private String workerName;
    private boolean newWorker;

    private Date entryTime;

    public Worker() {
    }

    public Worker(String workerName, Integer id, boolean newWorker, Date entryTime) {
        this.workerName = workerName;
        this.id = id;
        this.newWorker = newWorker;
        this.entryTime = entryTime;
    }

    public Worker(String workerName, boolean newWorker, Date entryTime) {
        this.workerName = workerName;
        this.newWorker = newWorker;
        this.entryTime = entryTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(id, worker.id) && Objects.equals(workerName, worker.workerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workerName);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", workerName='" + workerName + '\'' +
                ", newWorker=" + newWorker +
                ", entryTime=" + entryTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
