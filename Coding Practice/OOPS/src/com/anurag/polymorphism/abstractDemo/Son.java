package com.anurag.polymorphism.abstractDemo;

public  class Son extends Parent {


    public Son() {
        super(value);
    }

    @Override
    void career() {
        System.out.println(" I am going to be a Doctor");

    }

    @Override
    void partner() {
        System.out.println("I love paper pot");

    }
}
