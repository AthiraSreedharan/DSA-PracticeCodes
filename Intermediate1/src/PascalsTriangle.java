import java.util.ArrayList;

public class PascalsTriangle
{
    public static void main(String[] args)
    {
        int A=25;
        solve(A);


    }
    public static int[][] solve(int A)
    {
        int[][] res=new int[A][A];
        int i,j,k;


        for(i=0;i<A;i++)
        {
            int num=1;
            for (j=0;j<=i;j++)
            {
                res[i][j]=num;
                num = num*(i-j)/(j+1);
            }
            for(k=j;k<A;k++)
            {
                res[i][j]=0;
            }
        }
        for(int n=0;n<A;n++)
        {
            for(int m=0;m<A;m++)
            {
                System.out.print(res[n][m]);
            }
            System.out.println();
        }

        return res;

    }

}
