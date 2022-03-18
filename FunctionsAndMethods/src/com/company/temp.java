package com.company;

import java.util.Scanner;

public class temp
{
    public static void main(String[] args)
    {
        int[][] arr=create2DArray();
        printArrayInWaveOrder(arr);


        //int[]  arr={10,30,20};
        //boolean y=checkSorted(arr);
        //System.out.println(y);
    }
    static int[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        int rows,cols;

        rows = sc.nextInt();
        cols = sc.nextInt();
        //Create a 2D Array
        int[][] arr = new int[rows][cols];

        for(int i=0; i < rows; i++){
            //cols
            for(int j=0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    static void printArrayInWaveOrder(int[][] arr)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[0].length%2==0)
            {
                for(int i=0;i<arr[0].length;i++)
                {
                    System.out.print(arr[i][j]);
                }
            }
            else
                for(int i=arr.length-1;i>=0;i++)
                {
                    System.out.print(arr[i][j]);
                }

        }
    }



    public static boolean checkSorted(int[] arr)
    {
        int j=0;
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                j++;
                System.out.println(j);
                return true;
            }
        }
        return false;
    }

}

