package com.anurag.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Engine car2 = new Car();

        car.start();
        car.acc();
        car.brake();
        car.stop();

        NiceCar carr = new NiceCar();
        carr.start();
        carr.startMusic();

        Car newcar = new CDPlayer();
        Media newcar2 = new CDPlayer();
        Brake newcar3 = new CDPlayer();

        newcar.start();
        newcar2.start();
        newcar3.start();


    }
}
