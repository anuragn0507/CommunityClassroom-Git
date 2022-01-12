package com.anurag.comparing;

public class Main implements Comparable{
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.67f);
        Student Rahul = new Student(12, 89.67f);

        if(kunal < Rahul){
            System.out.println("Rahul has more makrks ");

        }
    }
}
