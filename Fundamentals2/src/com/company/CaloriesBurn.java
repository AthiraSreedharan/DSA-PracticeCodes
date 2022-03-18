package com.company;

public class CaloriesBurn {
    public static void main(String[] args) {
        for(int calories=0;calories<=100;calories++)
        {
            if(calories==50)
            {
                System.out.println("Half done, take some rest");
                break;
            }
            if(calories%10==0)
            {
                System.out.println("Great work,keep going");
                continue;
            }

            System.out.println("caloreis burnt is "+calories);
        }
    }

}
