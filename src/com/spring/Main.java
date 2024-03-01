package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
        AbstractApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");

        // // constructor injection
        // SpringConstructor cons=(SpringConstructor)ap.getBean("coning");
        // cons.showInjection();


         //example of scope in spring         
        SpringMessage sp=(SpringMessage)ap.getBean("scope1");

        sp.setSpmessage("Hi!! Hellow");
        sp.getSpmessage();

        SpringMessage sp1=(SpringMessage)ap.getBean("scope1");
        
        sp1.getSpmessage(); 


       /* //lifecycle of a bean
       // to close a bean you need AbstractApplicationcontext
        AbstractApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
        LifecycleExample lyc=(LifecycleExample)ap.getBean("lifecycle");
        lyc.setName("Darunesh");
        lyc.getName();
        // ap.registerShutdownHook();//present in AbstractAppli only
        ap.close(); */


        /*// example of setter injection
        SetterInjection sp=(SetterInjection)ap.getBean("setterinj");
        System.out.println("The name is:"+sp.getName());
        System.out.println("The id is:"+sp.getId());
        ap.close();*/

       /* //example of collectioninjection
        CollectionInjection col=(CollectionInjection)ap.getBean("colinj");
        System.out.println("This is a List:"+col.getIntList());
        System.out.println("This is a Set:"+col.getStrSet());
        System.out.println("This is a map:"+col.getStrMap()); */

        
    }

}
