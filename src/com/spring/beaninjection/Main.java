package com.spring.beaninjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.AnnotationExample;

import org.springframework.context.annotation.*;;

public class Main {

    public static void main(String[] args) {
        
        AbstractApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");

        /*this code is for beaninjection */
        // PlayInstruments pl=(PlayInstruments)ap.getBean("beaninj");
        // pl.instruimentsUsed();

        //this is for autowired
        // PlayInstruments pl=(PlayInstruments)ap.getBean("playInstruments");
        // pl.instruimentsUsed();


        //this is for autowired by annotation
        AnnotationExample ae=(AnnotationExample)ap.getBean("annotation");
        ae.playInstruments();


    }

}
