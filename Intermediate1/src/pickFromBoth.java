import java.util.ArrayList;
import java.util.Scanner;

public class pickFromBoth {
    public static int solve(ArrayList<Integer> A, int B)
    {
        int N=A.size();
        int max=0;
        int sumf=0;
        int sumb=0;

        int[] pf=new int[N];
        for(int i=0;i<N;i++)
        {
            if(i==0)
                pf[0]=A.get(0);
            else
                pf[i]=pf[i-1]+A.get(i);
        }
        for(int i=0,j=B;i<B;i++,j--)
        {
                sumf=pf[i];
                sumb=pf[N-1]-pf[N-j];

            int sum=sumf+sumb;
            max=Math.max(sum,max);
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            A.add(sc.nextInt());
        }
        int B=sc.nextInt();

        //System.out.println(A.length);
        System.out.println(solve(A,B));
    }
}
