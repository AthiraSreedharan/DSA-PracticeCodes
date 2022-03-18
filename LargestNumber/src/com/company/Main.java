package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A,B,C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values you want to compare");
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();

        if(A>B && A>C)
            System.out.println(A+" is the greatest number");
        else if (B>A && B>C)
            System.out.println(B+" is the greatest number");
        else
            System.out.println(C+" is the greatest number");

    }
}
