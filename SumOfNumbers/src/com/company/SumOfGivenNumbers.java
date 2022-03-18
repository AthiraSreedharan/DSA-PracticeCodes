package com.company;

import java.util.Scanner;

public class SumOfGivenNumbers {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int times = 1;
        while (times <= n) {
            //int current = sc.nextInt();
            sum = sum + sc.nextInt();
            times = times + 1;
        }
        System.out.println(sum);
    }
}
