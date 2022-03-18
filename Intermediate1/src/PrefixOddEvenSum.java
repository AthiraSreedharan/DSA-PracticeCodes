import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrefixOddEvenSum {

    public static int solve(ArrayList<Integer> A)
    {
        int[] pfOdd=new int[A.size()];
        int[] pfEven=new int[A.size()];

        pfEven[0]=A.get(0);
        pfEven[1]=pfEven[0];

        pfOdd[0]=0;
        pfOdd[1]=A.get(1);

        for(int i=0;i<A.size();i++)
        {
            if(i%2==0)
            {
                pfEven[i]=pfEven[i-2]+A.get(i);
                pfOdd[i]=pfOdd[i-1];
            }
            else
            {
                pfOdd[i]=pfOdd[i-2]+A.get(i);
                pfEven[i]=pfEven[i-1];
            }
        }

        int c=0;
        for(int i=0;i<A.size();i++)
        {
            int sumOdd=0;
            int sumEven=0;
            if(i==0)
            {
                sumOdd=pfEven[pfEven.length-1]-pfEven[0];
                sumEven=pfOdd[pfOdd.length-1]-pfOdd[0];
            }
            else if(i==A.size()-1)
            {
                sumEven=pfEven[pfEven.length-2];
                sumOdd=pfOdd[pfOdd.length-2];
            }
            else
            {
                    sumEven=pfEven[i-1]+pfOdd[pfOdd.length-1]-pfOdd[i];
                    sumOdd=pfOdd[i-1]+pfEven[pfEven.length-1]-pfEven[i];
            }
            if(sumEven==sumOdd)
            c++;
        }


        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            A.add(sc.nextInt());
        }

        //System.out.println(A.length);
        System.out.println(solve(A));
    }
}
