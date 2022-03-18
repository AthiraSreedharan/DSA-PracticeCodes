package com.company;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int sum=0;

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//sum of n even numbers
        for(int j=1;j<=n;j++)
        {
            for(int i=2;i<=j;i=i+2)
            {
                sum=sum+i;
            }
        }
//sum of even numbers in given range
/*
        for(int i=2;i<=n;i=i+2)
        {
            sum=sum+i;
        }
*/
        System.out.println(sum);
    }
}
