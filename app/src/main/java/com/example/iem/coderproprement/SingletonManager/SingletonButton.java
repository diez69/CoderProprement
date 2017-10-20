package com.example.iem.coderproprement.SingletonManager;

/**
 * Created by iem on 20/10/2017.
 */

public class SingletonButton {
    private SingletonButton(){}


    private static SingletonButton INSTANCE = null;

    public static SingletonButton getInstance() {
        if (INSTANCE == null){
            INSTANCE = new SingletonButton();
        }
        return INSTANCE;
    }

    public static String getData() {
        return "Hola";
    }
}
