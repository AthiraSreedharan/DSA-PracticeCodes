package com.company;

public class SquareRoot {
    public static int squrRoot(int n)
    {
        int i=0;
        while(i*i<=n)
        {
           i++;
        }
        return i-1;
    }

    public static double squrRoot(int n,int p)
    {
        double i=0;
        double inc=1;

        for(int work=1;work<=p+1;work++)
        {
            while(i*i<=n)
            {
                i=i+inc;
            }
            i=i-inc;
            inc=inc/10;

        }
        return i;
    }

    public static void main(String[] args) {
        int n=10;
        double ans=squrRoot(10,3);
        System.out.println(String.format("%.4f",ans));
        System.out.println(squrRoot(9));


    }
}
