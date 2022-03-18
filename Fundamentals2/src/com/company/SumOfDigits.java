package com.company;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        while(n>0)
        {
          int last_digit=n%10;
          sum+=last_digit;
          n=n/10;
        }
        System.out.println("sum of digits = "+sum);
    }
}
