import java.util.ArrayList;

public class ArrayWithConsecutiveElements {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        long sum=0;
        long trueSum=0;
        int n=A.length;

        for(int i=0;i<n;i++)
        {
            if(A[i]>max)
                max=A[i];
            if(A[i]<min)
                min=A[i];

            sum=sum+A[i];
        }
        System.out.println(min+"min");
        System.out.println(max);
        System.out.println("sum "+sum);

        for(int i=min;i<=max;i++)
            trueSum=trueSum+i;
        System.out.println("trueSum "+trueSum);

        if(sum==trueSum)
            return 1;
        else
            return 0;
    }
}
