package com.company;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(10);
        list.add(20);

        if(list.contains(20))
            System.out.println("yes");
    }
}
