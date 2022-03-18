public class MaxSumSubarray {
    public static void main(String[] args) {
        int[][] A={{5, 17, 100, 11},{0, 0, 2, 8}};
        int[] B={1,1};
        int[] C={1,4};
        int[] D={2,2};
        int[] E={2,4};

        solve(A,B,C,D,E);

    }

    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int N=A.length;
        System.out.println(N);
        int M=A[0].length;
        System.out.println(M);

        long[][] P=new long[N][M];

        P[0][0]=A[0][0];

        for(int j=1;j<M;j++)
        {
            P[0][j]=P[0][j-1]+A[0][j];
        }
        for(int i=1;i<N;i++)
        {
            P[i][0]=P[i-1][0]+A[i][0];
        }

        for(int i=1;i<N;i++)
        {
            for(int j=1;j<M;j++)
                P[i][j] = P[i - 1][j] + P[i][j - 1] - P[i - 1][j - 1] + A[i][j];
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(P[i][j]+" ");
            }
            System.out.println();
        }
        int[] ans=new int[B.length];
        for(int i=0;i<B.length;i++)
        {
            int topX=B[i]-1;
            int topY=C[i]-1;
            int bottomX=D[i]-1;
            int bottomY=E[i]-1;

            long sum=P[bottomX][bottomY];

            if(topX>0)
                sum=sum-P[topX-1][bottomY];
            if(topY>0)
                sum=sum-P[bottomX][topY-1];
            if(topX>0 && topY>0)
                sum=sum+P[topX-1][topY-1];

            ans[i]=(int)sum%1000000007;

        }
        System.out.println("ans");
        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);

        return ans;
    }
}
