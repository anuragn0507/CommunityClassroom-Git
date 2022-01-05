package com.anurag.interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I Brake like a normal car");

    }

    @Override
    public void start() {
        System.out.println("I Start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car   ");

    }
}
