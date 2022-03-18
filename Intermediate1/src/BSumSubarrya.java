import java.util.ArrayList;
import java.util.Scanner;

public class BSumSubarrya {
    public static void main(String[] args) {
        ArrayList<Integer> A= new ArrayList<>();

        ArrayList<Integer> Ans= new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(3);
        A.add(4);
        A.add(6);
        int B=5;
        Ans=solve(A,B);
        for(int i=0;i<Ans.size();i++)
        System.out.println(Ans.get(i));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B)
    {
        int n=A.size();

        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int sum=0;

        for(int right=0;right<n;right++)
        {
            sum=sum+A.get(right);
            //System.out.println("sum "+sum);
            while(sum>B & left<=right)
            {
                sum=sum-A.get(left);
                left++;

                if(sum==B)
                {
                    for(int i=left;i<=right;i++) {
                        list.add(A.get(i));
                        //System.out.println("ans " + A.get(i));
                    }
                    return list;
                }

                if(right<=n)
                sum=sum+A.get(right);
            }

        }
        list.add(-1);
        return list;


    }
}
