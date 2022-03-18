import java.lang.*;
import java.util.*;

public class OddAndEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //number of inputs


        for (int i = 0; i < T; i++)
        {

            int N = sc.nextInt();//length of array
            int[] A = new int[N];
            List<Integer> odd = new ArrayList<Integer>();
            List<Integer> even = new ArrayList<Integer>();
            for (int j = 0; j < N; j++)
            {
                A[j] = sc.nextInt();
            }
            for (int k = 0; k < N; k++)
            {
                if (A[k] % 2 == 0)
                {
                    even.add(A[k]);
                }
                else
                    odd.add(A[k]);
            }
            for(int o :odd)
            {
                System.out.print(o+" ");
            }
            System.out.println();
            for(int e :even)
            {
               System.out.print(e+" ");
            }

        }
    }
}
