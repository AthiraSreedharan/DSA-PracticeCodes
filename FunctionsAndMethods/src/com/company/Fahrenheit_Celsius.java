package com.company;

public class Fahrenheit_Celsius {

    public static void main(String[] args) {
        int N = 6;
        double F = 32;
        double C = 0;

        for (int i = 1; i <= N; i++) {
            C = 5 * (F - 32) / 9;
            System.out.println(F + "F =" + C + "C");

            if (i == 1)

                F = F + 8;
            else
                F = F + 10;


        }

    }
}
