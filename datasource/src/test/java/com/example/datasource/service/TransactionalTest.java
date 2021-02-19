package com.example.datasource.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionalTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public  void  dynamicDB(){
        transactionService.method01();
    }

    @Test
    public void dynamicTransactional(){
        transactionService.method02();
    }
}
