package com.company;

public class stringsOcur {
    public static void main(String[] args) {
        String para="India is my, is also, is in the";
        String key="is";
        printAllOcc(para,key);

    }


        static void printAllOcc(String paragraph, String key)
        {
            int N=paragraph.length();
            int first=paragraph.indexOf(key);
            //System.out.println("N"+N);
            while(first!=-1)
            {

                System.out.printf("found %s at %d \n",key,first);
                first=paragraph.indexOf(key,first+1);
            }

        }
}
