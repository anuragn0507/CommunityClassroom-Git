package com.anurag;

import java.util.ArrayList;
import java.util.Scanner;




public class Userinput {

    ArrayList<int> cars= new ArrayList<int>();

    public static void main(String[] args){
        Scanner myinput = new Scanner(System.in);
        System.out.println("pleases enter the String  input");

        String userinput=  myinput.nextLine();
        System.out.println("Please enter the integer input");
        int userintinput= myinput.nextInt();
        System.out.println(userinput);
        System.out.println(userintinput);

    }
}
