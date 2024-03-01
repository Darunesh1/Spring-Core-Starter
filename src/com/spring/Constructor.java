package com.spring;

public class Constructor {

    private String name;
    private int id;


    public Constructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showValues()
    {
        System.out.println("The Name is:"+name+" ID:"+id);
    }

    public static void main(String[] args) {

        Constructor co=new Constructor("Darrunesh", 1117);
        co.showValues();
    }

    

}
