package com.company;

import java.util.Scanner;

public class charPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //char value='A';

        //loop for rows
        for(int i=1;i<=n;i++)
        {
            int value=(int)'A';
            //char value='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)value);
                //System.out.print(value);
                value++;
            }
            value=value-2;
            for(int j=1;j<i;j++)
            {
                System.out.print((char)value);
                //System.out.print(value);
                value=value-1;

            }
            //print new line
            System.out.println();
        }
    }
}
