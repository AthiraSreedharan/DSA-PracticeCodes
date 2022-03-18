import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingSubarray
{
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();

        solve(A, B);
    }

    public static void solve(ArrayList<Integer> A, int B)
        {
            int k=2*B+1;
            int count=0;
            int N=A.size();
            int[] left=new int[N];
            left[0]=1;
            int[] right=new int[N];
            right[N-1]=1;

            ArrayList<Integer> ans=new ArrayList<>();

            for(int i=1;i<N;i++)
            {
                if(A.get(i)!=A.get(i-1))
                    left[i]=1+left[i-1];
                else if(A.get(i)==A.get(i-1))
                    left[i]=1;
            }
            for(int i=0;i<N;i++)
                System.out.print(left[i]+" ");

            for(int i=N-2;i>=0;i--)
            {
                if(A.get(i)!=A.get(i+1))
                    right[i]=1+right[i+1];
                else if(A.get(i)==A.get(i+1))
                    right[i]=1;
            }
            for(int i=0;i<N;i++)
                System.out.print(right[i]+" ");
            System.out.println();
            for(int i=0;i<N;i++)
            {
                if(left[i]>=B+1 && right[i]>=B+1)
                {
                    ans.add(i);
                    count++;
                }
            }
            for(int i=0;i<count;i++)
                System.out.print(ans.get(i)+" ");
        }
}
