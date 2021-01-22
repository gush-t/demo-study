package com.example.workstudy.jdk;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class ThreadTest03 implements Callable<ResultObject> {
    @Override
    public ResultObject call() throws Exception {
        ResultObject resultObject = new ResultObject();
        String threadName = Thread.currentThread().getName();
        resultObject.setThreadName(threadName);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("start","Hello world");
        resultMap.put("end","dead people");
        resultObject.setResult(resultMap);
        return resultObject;
    }
}
