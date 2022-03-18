import java.util.Scanner;

public class FindSmallestSubarayMaxMin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int max_val=Integer.MIN_VALUE;
        int min_val=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            if(A[i]>max_val)
                max_val=A[i];
            else if(A[i]<min_val)
                min_val=A[i];
        }
        //System.out.println(min_val);

        int max_i=-1;
        int min_i=-1;
        int ans=N;

        for(int i=N-1;i>=0;i--)
        {
            if(A[i]==max_val)
            {   max_i=i;

                if(min_i!=-1)
                    ans=Math.min(ans,min_i-max_i+1);
            }

            else if(A[i]==min_val)
            {   min_i=i;
                if(max_i!=-1)
                    ans = Math.min(ans, max_i - min_i + 1);
            }
        }
        /*--from left to right approach
        for(int i=0;i<N;i++)
        {
            if(A[i]==min_val)
            {
                min_i=i;
                if(max_i!=-1)
                    ans=Math.min(ans,min_i-max_i+1);
            }
            else if(A[i]==max_val)
            {
                max_i=i;
                if(min_i!=-1)
                    ans=Math.min(ans,max_i-min_i+1);
            }
        }
        */

        System.out.println(ans);
    }
}
