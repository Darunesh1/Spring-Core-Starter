package com.Asspect;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        

        AbstractApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");

        AOPExample aop=(AOPExample)ap.getBean("aopbean");
        aop.showValues();
    }

}
