package com.company;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=0;



        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i ==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD = "+gcd);
        int lcm= (a*b)/gcd;
        System.out.println("LCM = "+lcm);
    }
}
