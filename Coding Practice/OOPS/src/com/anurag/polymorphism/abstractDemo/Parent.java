package com.anurag.polymorphism.abstractDemo;

public  abstract class Parent {


    protected Parent(int value) {
        this.value = value;
    }

    abstract void career ();
    abstract void partner();

    final int value;

}
