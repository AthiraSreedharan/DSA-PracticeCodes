import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArithmeticProgressionSorting
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
        //solve(A);

    }
        public static int solve(ArrayList<Integer> A)
        {
            int N=A.size();
            Collections.sort(A);
            System.out.println("Sorted array");
            for(int i=0;i<N;i++)
            {
                System.out.print(A.get(i)+" ");
            }

            int c=0;
            System.out.println(A.get(1));
            System.out.println(A.get(0));
            int diff=A.get(1)-A.get(0);
            System.out.println("difference "+diff);
            for(int i=1;i<N-1;i++)
            {
                if(A.get(i+1)-A.get(i)==diff)
                    c++;
                else
                    break;
            }
            if(c==0)
                return 0;
            else
                return 1;
        }

}
