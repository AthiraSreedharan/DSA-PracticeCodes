package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int largest=Integer.MIN_VALUE;

        for(int cnt=1;cnt<=n;cnt++)
        {
            int num=sc.nextInt();
            if(num>largest)
                largest=num;
        }
        System.out.println("largest number : "+largest);
    }
}
