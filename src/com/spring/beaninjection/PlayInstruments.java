package com.spring.beaninjection;

public class PlayInstruments {

    Instruiments instruiments;
   

    

    public void instruimentsUsed()
    {
        System.out.println(instruiments.sound());
    }




    public Instruiments getInstruiments() {
        return instruiments;
    }




    public void setInstruiments(Instruiments instruiments) {
        this.instruiments = instruiments;
    }

}
