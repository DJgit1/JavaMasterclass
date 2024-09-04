package com.dj;

public class Truck implements Trackable{

    public void track() {

        System.out.println(getClass().getSimpleName() + "'s coordinates were recorded");
    }
}
