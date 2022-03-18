package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr=new int[n][n];
        arr = solve(n);



        //printing
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int n)
    {
        int[][] a = new int[n][n];
        int i=0,j=0;

        for (i = 0; i < n; i++)
        {

            for (j = 0; j <=i; j++)
            {
                if (j == 0 || j == i)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
            for(int k=0;k<n;k++)
            {
                for(int l=k+1;l<n-k-1;l++)
                {
                    System.out.println("k"+l);
                    a[k][l]=9;
                }
            }

        }
        return a;


    }
}
