package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.beaninjection.Instruiments;

public class AnnotationExample {

    @Autowired
    @Qualifier("drum")
    private Instruiments instruiments;

   public void playInstruments()
   {
    System.out.println(instruiments.sound());
   }
    

}
