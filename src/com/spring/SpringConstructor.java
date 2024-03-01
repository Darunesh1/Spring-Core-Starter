
package com.spring;

public class SpringConstructor {

    private int id;
    private String name1;
    private String clas;
    private int phone;


    public SpringConstructor(int id, String name1,String clas,int phone) {
        this.id = id;
        this.name1 = name1;
        this.clas=clas;
        this.phone=phone;
    }

    public void showInjection()
    {
        System.out.println("The Name is:"+name1+" ID:"+id+" The class is:"+clas);
        System.out.println("The phone number is:"+phone);
    }

    

}
