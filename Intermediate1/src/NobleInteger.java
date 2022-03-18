import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NobleInteger
{
    public static void main(String[] args)
    {
        ArrayList<Integer> A=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            A.add(sc.nextInt());
        }
        System.out.println(solve(A));

    }
        public static int solve(ArrayList<Integer> A)
        {
            int N=A.size();
            Collections.sort(A,Collections.reverseOrder());
            for(int i=0;i<N;i++)
            {
                System.out.print(A.get(i)+" ");
            }

            int count=0;
            int greater=0;
            if(A.get(0)==0)
                count++;

            for(int i=1;i<N;i++)
            {
                if(A.get(i)!=A.get(i-1))
                    greater=i;
                if(greater==A.get(i))
                    count++;
            }
            if(count>=0)
                return 1;
            else
                return -1;
        }
}
