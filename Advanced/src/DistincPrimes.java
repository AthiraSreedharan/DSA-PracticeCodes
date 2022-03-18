import java.util.Arrays;
import java.util.HashSet;

public class DistincPrimes {
    public static void main(String[] args) {

    }
    public static int solve(int[] A) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<A.length;i++)
        {
            for(int j=2;j*j<=A[i];j++)
            {
                if(A[i]%j==0)
                {
                    set.add(j);
                }
                while(A[i]%j==0)
                {
                    A[i]=A[i]/j;
                }

            }
        }
        return set.size();

    }
}
