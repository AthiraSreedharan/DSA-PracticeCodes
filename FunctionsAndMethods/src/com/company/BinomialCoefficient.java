package com.company;

public class BinomialCoefficient {
    public static void main(String[] args) {

        System.out.println(factorial(10));
        System.out.println(binomialCoeff(10,2));
    }

    static int factorial(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=ans*i;
        }
        return ans;

    }
    static int binomialCoeff(int n,int r)
    {
        int ans=factorial(n)/(factorial(r)*factorial(n-r));
        return ans;

    }
}
