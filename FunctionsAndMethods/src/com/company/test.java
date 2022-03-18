package com.company;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long M=sc.nextLong();

        for(int i=0;i<M;i++)
        {
            int a=sc.nextInt();
            long b=sc.nextLong();
            if(a==1)//add
            {
                N=N+b;
            }
            else if(a==2)
            {
                if(b<=N)
                {
                    N=N-b;
                }
                else
                    System.out.println("Insufficient Funds");
            }

            System.out.println(N);

        }


    }

}



