package com.company;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();


        for(int i=1;i<=input;i++)
        {
            int number=sc.nextInt();
            int cnt=0;

            while(number!=0)
            {
                cnt++;
                number=number/10;
            }
            System.out.println("Number of digits "+cnt);
        }

    }
}
