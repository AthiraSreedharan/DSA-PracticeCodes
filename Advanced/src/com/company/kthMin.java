package com.company;

import java.util.ArrayList;
import java.util.List;

public class kthMin {

    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(5);
        A.add(56);
        A.add(15);
        A.add(3);
        A.add(7);
        A.add(2);
        A.add(1);
        System.out.println();
        kthsmallest(A,2);

    }
    public static int kthsmallest(final List<Integer> A, int B) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<A.size();i++)
            list.add(A.get(i));

        int N=list.size();

        for(int i=0;i<N-1;i++) {
            int index = i;
            for (int j = i; j < N; j++) {
                if (list.get(j) < list.get(index)) {
                    index = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
            for(int s=0;s<list.size();s++)
             System.out.print(list.get(s)+" ");
             System.out.println();

        }
       // System.out.println();
        //for(int i=0;i<list.size();i++)
            //System.out.print(list.get(i)+" ");

    return list.get(B-1);
    }

}

