package com.anurag.interfaces;

public class CDPlayer extends Car implements Media, Brake {


    @Override
    public void start() {
        System.out.println("Music Start");

    }

    @Override
    public void stop() {
        System.out.println("Music Stop");

    }
}
