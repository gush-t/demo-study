package com.example.workstudy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockTest {

    /**
     *
     * @param args
     */

    public static void main(String[] args)  {
        Thread thread = new ThreadExtends();
        Thread thread1 = new ThreadExtends();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            executorService.execute(thread);
        }

        int bottle  = 81 ;
        int size = bottle/3;
        int number = 0 ;
        for (int i = 0; i < size; i++) {
            number = bottle/3 + number;
            int residue = bottle/3;
            int remainder = bottle%3;
            bottle = remainder+residue;
            if (bottle ==2 && i ==2){
                number = number+1;
            }
        }
        System.out.println(number);
    }
}
