package com.dj;

import java.util.Scanner;

public class X {

    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 0; x < 13; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
