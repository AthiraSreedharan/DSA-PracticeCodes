package com.company;

import java.util.Scanner;
import java.lang.*;

public class patternHW {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        //sc.nextInt();


        int n1=24;
        int n2=36;
        int min=Math.min(n1,n2);
        //System.out.println(min);

        //find HCF
        int hcf=0;
        int k=1;
        while(k<=min)
        {
            //System.out.println(k);
            if(n1%k==0 && n2%k==0)
            {
                hcf=k;
            }
            k++;
        }
        System.out.println(hcf);

        //}


    }
}
