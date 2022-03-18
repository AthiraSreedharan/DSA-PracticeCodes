package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int n1=num;
        int reverse=0;
        while(num!=0)
        {
            int lst_digit=num%10;
            reverse=reverse*10+lst_digit;
            //System.out.println(lst_digit);
            num=num/10;
        }
        System.out.println(reverse);

        //using for loop
        for(;n1!=0;n1=n1/10)
        {
            System.out.print(n1%10);
        }


    }
}
