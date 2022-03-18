package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int N;
        int i=1;
        int sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        N=sc.nextInt();

        while(i<=N)
        {
          sum=sum+i;
          i++;
        }
        System.out.println("Sum of numbers from 1 to "+N+" numbers is "+sum);
    }
}
