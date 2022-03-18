/*
Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.
NOTE:
-Each element in the result should appear as many times as it shows in both arrays.
-The result can be in any order.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of first array");
            int N=sc.nextInt();
        ArrayList<Integer> A=new ArrayList<Integer>();
            for(int i=0;i<N;i++)
                A.add(sc.nextInt());
        System.out.println("Enter size of second array");
            int M=sc.nextInt();
        ArrayList<Integer> B=new ArrayList<Integer>();
            for(int i=0;i<M;i++)
                B.add(sc.nextInt());

        System.out.println(solve(A,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B)
    {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<A.size();i++)
            map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);

        for(int i=0;i<B.size();i++)
        {
            if(map.containsKey(B.get(i))) {
                if (map.get(B.get(i)) > 0) {
                    list.add(B.get(i));
                    map.replace(B.get(i), map.get(B.get(i)) - 1);
                }
            }
        }
        return list;

    }
}
