package com.company;

public class TrailingZeros {


    static int trailingZeros(int n)
    {
        int ans = 0;
        int p = 5;
        while (n / p > 0)
        {
            ans = ans + n / p;
            p = p * 5;
        }
        return ans;
    }


    public static void main(String[] args) {
        int n=5;
        int ans=trailingZeros(n);
        System.out.println("Trailing zero's in "+n+" factorial is "+ans);

    }
}

