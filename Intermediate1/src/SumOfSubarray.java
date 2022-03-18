public class SumOfSubarray {
    public static void main(String[] args)
    {
        int[] A={1,2,3,4,5};
        int[][] B={{1,4},{2,3}};
        int M=B.length;
        int N=A.length;
        long[] retArr=new long[M];

        int[] pf=new int[N];

        for(int i=0;i<N;i++)
        {
            if(i==0)
                pf[i]=A[i];
            else
                pf[i]=pf[i-1]+A[i];
            //System.out.println(pf[i]);
        }

        for(int i=0;i<M;i++)
        {
            int L=B[i][0];
            int R=B[i][1];
            if(L==1)
                retArr[i]=pf[R-1];
            else
                retArr[i]=pf[R-1]-pf[L-2];
        }
        //return retArr;

    }


}
