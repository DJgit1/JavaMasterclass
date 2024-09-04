package com.dj;

public class Dog extends Mammals{


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equals("slow")){
            System.out.println( getExplicitType() + " walking");
        }else {
            System.out.println( getExplicitType() + " running");
        }
    }

    @Override
    public void shedHAir() {

        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {

        if (type == "Wolf"){
            System.out.println("Howling! ");
        }else {
            System.out.println("Woof! ");
        }

    }
}
