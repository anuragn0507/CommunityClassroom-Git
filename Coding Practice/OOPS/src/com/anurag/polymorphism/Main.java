package com.anurag.polymorphism;



public class Main {

    public  static void Summ(){
        System.out.println("testing the static method in main method");
            }



    public static void main(String[] args){



        Shapes shapes= new Shapes();
        Circle shapes1 = new Circle();
        Circle  circleshape = new Circle();

        shapes.Shapes();
        shapes1.Shapes();
        circleshape.Shapes();
        Circle.Shapes();
        Shapes.Shapes();
        Main.Summ();



    }
}
