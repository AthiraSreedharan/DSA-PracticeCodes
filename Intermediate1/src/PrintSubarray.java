public class PrintSubarray {
    public static void main(String[] args)
    {
        int[] A={1,2,3,4};
        int N=A.length;

        for(int i=0;i<N;i++)
        {
            for(int j=i;j<N;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(A[k]+" ");

                }
                /*
                int k=i;
                while(k<=j)
                {
                  System.out.print(A[k]+" ");
                  k++;
                }*/

                System.out.println();
            }


    }

    }
}
