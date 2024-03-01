package com.Asspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

public class AfterReturnExample implements AfterReturningAdvice{

    @Override
    public void afterReturning(@Nullable Object returnValue, Method method, Object[] args, @Nullable Object target)
            throws Throwable {
                System.out.println("This is after the ");
        
    }

}
