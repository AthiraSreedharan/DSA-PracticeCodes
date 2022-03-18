package com.company;

import java.util.Scanner;

public class PatternOfStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //loop for rows
        for(int i=1;i<=n;i++)
        {
            //loop for printing start
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //print new line
            System.out.println();
        }
    }
}
