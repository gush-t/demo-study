package com.example.jdktest.controller;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



public class WorkerControllerTest {


    private MockMvc mockMvc;

    public void testAll() throws Exception {
        //获取查询结果
        //ResultActions resultAction = mockMvc.perform(MockMvcRequestBuilders.get("/Worker/all"));
        //校验结果
        //resultAction.andExpect(MockMvcResultMatchers.status().isOk());
        StringBuilder worker = new StringBuilder("{\n" +
                "  \"id\": 1,\n" +
                "  \"workerName\": \"21\",\n" +
                "  \"newWorker\": false,\n" +
                "  \"entryTime\": \"2021-02-04T16:00:00.000+00:00\"\n" +
                "}");
        //resultAction.andExpect(MockMvcResultMatchers.content().json(worker.toString()));
    }
}
