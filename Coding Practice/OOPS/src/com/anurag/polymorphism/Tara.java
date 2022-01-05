package com.anurag.polymorphism;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Tara {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Alice");
        list.add("Bob");
        list.add(1, "Mike");
        list.add(3,"Tara");

        list.remove("Tara");


        System.out.println(list);

    }
}
