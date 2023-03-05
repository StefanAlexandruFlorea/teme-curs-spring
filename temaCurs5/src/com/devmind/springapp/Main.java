package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Task myTask1= context.getBean("myTask", Task.class);
        myTask1.start();

//        Task myTask2=context.getBean("myTask", Task.class);
//        myTask2.run();

        context.close();
    }
}