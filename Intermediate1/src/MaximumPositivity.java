import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPositivity
{
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            A.add(sc.nextInt());
        }
        solve(A) ;
    }
    public static void solve(ArrayList<Integer> A)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int N=A.size();

        int i=0;
        int j=0;
        int start=0;
        int end=0;
        while(i<N && j<N)
        {
            if(A.get(j)>=0)
                j++;
            else
            {
                if (j - i > end - start +1)
                {
                    start = i;
                    end = j - 1;
                }

                i = j + 1;
                j++;
            }

        }
        for(int k=start;k<=end;k++)
        {
            ans.add(A.get(k));
        }
        for(int s=0;s<ans.size();s++)
        {
            System.out.println(ans.get(s));
        }
    }

}
