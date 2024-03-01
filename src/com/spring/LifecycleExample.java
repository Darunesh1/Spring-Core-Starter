package com.spring;

public class LifecycleExample {

    
    private String name;

    public void onInitialization()
    {
        System.out.println("Init methos is called");
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public void getName()
    {
        System.out.println(name);
    }

    public void onDestory()
    {
        System.out.println("Destory methos is called");
    }
    

}
