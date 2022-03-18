import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //int N=sc.nextInt();
        System.out.println("dkdsgjs");
int[] A={1,3,5};
int[] B={1,2,3};
int N=A.length;
        int cost=0;
        int ans=Integer.MAX_VALUE;

        for(int i=1;i<N-1;i++)
        {
            System.out.println("n");
            if(A[i]>A[i-1] && A[i]<A[i+1])
            {
                cost=B[i-1]+B[i]+B[i+1];
                System.out.println(cost);
            }
            ans=Math.min(ans,cost);
        }
        System.out.println(ans);
    }
}
