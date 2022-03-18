package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        for( ;i<n;i++)
        {
          if(n%i==0)
          {
              System.out.println("Not Prime");
              break;
          }
        }
        if(n==i)
        {
            System.out.println("Prime");
        }
    }
}
