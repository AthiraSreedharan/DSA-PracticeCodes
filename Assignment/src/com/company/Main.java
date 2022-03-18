package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        for(int i=1;i<=N;i++)
        {
            for (int j=i; j<=N-i ;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
