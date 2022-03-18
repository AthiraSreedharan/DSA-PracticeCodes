public class FantasticFour
{
    public static void main(String[] args)
    {
        int A[]={3,3,3,3};
        System.out.println("ans "+solve(A));

    }
    public static int solve(int[] A)
    {
        int N=A.length;
        int[] B={0,0,0,0};

        for(int i=0;i<N;i++)
        {
            B[A[i]%4]++;
        }
        for(int i=0;i<N;i++)
        System.out.println(B[i]);

        if((B[1]+2*B[2]+3*B[3])%4 ==0)
        {
            int min=Math.min(B[3],B[1]);
            B[3]=B[3]-min;
            B[1]=B[1]-min;

            min=min+B[2]/2;
            B[2]=B[2]%2;

            if(B[2]==1)
            {
                min=min+2;
                B[2]=0;

                if(B[3]==1)
                    B[3]=B[3]-2;

                if(B[1]==1)
                    B[1]=B[1]-2;
            }
            if(B[1]==1)
                min+=(B[1]/4)*3;

            if(B[3]==1)
                min+=(B[3]/4)*3;


            return min;
        }
        return -1;

    }
    }


