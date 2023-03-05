package com.devmind.springapp;

import java.util.Random;

public class Task extends Thread{
    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    private static int numberOfTask;
    private static int counter;

    public void run() {
        try {
            System.out.println("Task " + taskName + " is running and will sleep for " + executionTime/1000 + " seconds");
            Thread.sleep(executionTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Integer generateId() {
        return counter++;
    }

    private void numberOfTaskHook() {
        numberOfTask++;
        this.taskId = generateId();
        this.taskName = "Task" + taskId;

        int oneToTwentySeconds = (new Random().nextInt(20) + 1) * 1000;
        this.executionTime = oneToTwentySeconds;
    }

    private void destroy() {
        System.out.println(taskName + " was destroyed");
        numberOfTask--;
    }

    public String getTaskName() {
        return taskName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public Integer getExecutionTime() {
        return executionTime;
    }

    public static int getNumberOfTask() {
        return numberOfTask;
    }

    public static int getCounter() {
        return counter;
    }
}
