package com.Asspect;

public class AOPExample {

    private String name;
    private int id;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void showValues()
    {
        System.out.println("The name is:"+name);
        System.out.println("The id is:"+id);
        throw new IllegalArgumentException();
        
    }



    

}
