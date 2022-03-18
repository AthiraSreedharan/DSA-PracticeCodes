package com.company;

import java.util.Scanner;

public class PascalsTriangle {

        public static int solve(int n)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        public static int binomialCoeff(int n,int r)
        {
            int ans=solve(n)/(solve(r)*solve(n-r));
            return ans;
        }

        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    int ans=solve(i)/(solve(j)*solve(i-j));
                    System.out.print(ans+" ");
                }
                for(int k=1;k<n-i;k++)
                {
                    System.out.print("0");
                    if(k<n-i)
                        System.out.print(" ");
                }
                System.out.println();
            }
            //System.out.println(solve(0));
        }


    }


