//Q1. check if there exist a pair in the given array such that A[i]+A[j]=B, and i!=j;
//Q2. count the number of pairs in given array such that A[i]+A[j]=B, and i!=j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
            A.add(sc.nextInt());
        int B=sc.nextInt();
        System.out.println(solveQ1(A,B));
        System.out.println(solveQ2(A,B));

    }
    //Q1
    public static boolean solveQ1(ArrayList<Integer> A,int B)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<A.size();i++){
        if(set.contains(B-A.get(i)))
            return true;
        else
            set.add(A.get(i));
        }
        return false;
    }
    //Q2
    //1 2 9 3 5 9 9 k=18
    public static int solveQ2(ArrayList<Integer> A,int B)
    {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int i=0;i<A.size();i++){
            if(set.contains(B-A.get(i)))
                count++;
            else
                set.add(A.get(i)); 1 2 9 3 5
        }
        return count;
    }
}
