import java.util.Scanner;

import static java.lang.Math.max;

public class PrefixArray {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int N= sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
/*
        int[] pf=new int[N];
        for(int i=0;i<N;i++)
        {
            if(i==0)
                pf[i]=arr[0];
            else
                pf[i]=pf[i-1]+arr[i];
        }
        int s=0,e=k-1;
        for( ;s<=N-k;s++,e++)
        {
            System.out.println(s+" "+e);
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(pf[i]);
        }*/
        //sliding window approach
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        int ans=sum;
        int start=1,end=k;

        for(;start<=N-k;start++,end++)
        {
            sum=sum-arr[start-1]+arr[end];
            ans=max(sum,ans);
        }
        System.out.println(ans);

        //print array
        for(int i=0;i<k;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
