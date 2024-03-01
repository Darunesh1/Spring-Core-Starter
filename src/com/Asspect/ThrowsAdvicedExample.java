package com.Asspect;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvicedExample implements ThrowsAdvice {

    public void afterThrowing(IllegalArgumentException e) throws Throwable{
        System.out.println("Exception has occured");
    }

}
