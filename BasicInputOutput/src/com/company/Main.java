package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //primitive data type
        int a=10;
        float b=20.5f;
        boolean isRainy=true;
        char c='A';

        //non-primitive data type
        String name="Coding";

        //output
        System.out.println(a+b);
        System.out.println(name + a + b);
        System.out.println(name + (a + b));

        //input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        a = sc.nextInt();
        System.out.println("Your age is "+a);

        sc.nextLine(); // this is to capture enter we put after entering age , not required if we give input as 15 athira
        name = sc.nextLine();
        System.out.println("Your name is "+name);




    }
}
