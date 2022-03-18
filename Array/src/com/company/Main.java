package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x=sc.nextInt();
        int[] pos=findOcuurance(arr,x);
        for(int val : pos)
            System.out.println(pos[val]);
    }
    public static int[] findOcuurance(int[] arr,int x)
    {
        int[] arr2=new int[arr.length];
        for(int val : arr)
        {
         if(arr[val]==x)
         {
             for(int i=0;i<arr.length;i++)
             {
                 arr2[i]=val;
             }
         }
        }return arr2;
    }

	// write your code here
    }

