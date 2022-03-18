package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int N;
        int i = 2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check");
        N = sc.nextInt();

        if (i<N) {
            while (N % i == 0) {
                i++;
            }
            System.out.println("Number is not prime");
        } else
            System.out.println("Number is  prime");
    }
}
