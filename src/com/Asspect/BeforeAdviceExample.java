package com.Asspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

public class BeforeAdviceExample implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, @Nullable Object arg2) 
        throws Throwable {
        System.out.println("This is inside the before method advice");
    }

    

}
