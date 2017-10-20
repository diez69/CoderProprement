package com.example.iem.coderproprement.SingletonManager;

import java.util.Random;

/**
 * Created by iem on 20/10/2017.
 */

public class SingletonButton {
    private SingletonButton(){}


    private static SingletonButton INSTANCE = new SingletonButton();

    public static SingletonButton getInstance() {
        if (INSTANCE == null){
            INSTANCE = new SingletonButton();
        }
        return INSTANCE;
    }

    public String isConnected() {
        return "Device paired";
    }

    public int getRate() {
        Random r=new Random();
        return r.nextInt(20)+65;
    }
}
