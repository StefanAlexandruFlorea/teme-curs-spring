package com.devmind.springapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Pointcut("execution(* run*(..))")
    private void runMethod() {}

    @Before(value="runMethod()", argNames = "joinPoint")
    public void afterCall(JoinPoint joinPoint){
        System.out.println("Method: "+joinPoint.getSignature()+" was called");
    }
}
