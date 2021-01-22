package com.example.workstudy.jdk;

import java.util.Map;

public class ResultObject {

    private String threadName;

    private Map<String,Object> result;

    public ResultObject(String threadName, Map<String, Object> result) {
        this.threadName = threadName;
        this.result = result;
    }

    public ResultObject() {
    }

    @Override
    public String toString() {
        return "ResultObject{" +
                "threadName='" + threadName + '\'' +
                ", result=" + result +
                '}';
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }
}
