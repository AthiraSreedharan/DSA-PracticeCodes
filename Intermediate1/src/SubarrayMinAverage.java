import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayMinAverage
{
    public static void main(String[] args)
    {
        ArrayList<Integer> A=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            A.add(sc.nextInt());
        }
        int B=sc.nextInt();

        System.out.println("\n"+solve(A,B));


    }
    public static int solve(ArrayList<Integer> A, int B)
    {
        int N=A.size();
        //int avg=0;
        // int sum=0;
        int index=-1;
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> pf=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(i==0)
                pf.add(A.get(0));
            else
                pf.add(pf.get(i-1)+A.get(i));
        }
        for(int i=0;i<N;i++)
           // System.out.print(pf.get(i)+" ");

        for(int s=0,e=B-1;s<=N-B;s++,e++)
        {
            int sum=0;
            if(s==0)
                sum=pf.get(e);
            else
            {
                sum=sum+pf.get(e)-pf.get(s-1);
            }
           // System.out.println(sum);
            //avg=sum/B;
            if(min>sum)
            {
                index=s;
                //min=avg;
            }
            //System.out.println(index);
        }
        return index;

    }
    }


