package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int p,r,t;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of P,T and R");
        p=sc.nextInt();
        t= sc.nextInt();
        r=sc.nextInt();

        float si = (p*r*t)/100f ;
        float interest = (float)(p*r*t)/100 ;

        System.out.println("Simple Interest = "+si);
        System.out.println("Simple Interest = "+interest);

        //System.out.println((26*32)/100.0f);


    }
}
