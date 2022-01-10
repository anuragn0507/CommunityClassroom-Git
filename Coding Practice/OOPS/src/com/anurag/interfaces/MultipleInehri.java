package com.anurag.interfaces;


interface AnimalEat{
    default void eat(){
        System.out.println("Animal Eat");
    }
}

interface HumanEat{
    void eat();
}

class Being implements AnimalEat, HumanEat{
    public static void eat(){
        System.out.println("Animal is eating");

    }
}
public class MultipleInehri {
    public static void main(String[] args){
        AnimalEat animaleat= new AnimalEat() {
            @Override
            public void eat() {
                AnimalEat.super.eat();
            }
        };
        Being.eat();

    }

}
