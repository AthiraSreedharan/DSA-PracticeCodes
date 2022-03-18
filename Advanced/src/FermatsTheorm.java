public class FermatsTheorm {
    public static void main(String[] args) {
        int n=41;
        int r=27;
        int c=143;
        System.out.println(solve(n,r,c));

    }
    public static int solve(int n,int r,int m)
    {
        int[][] ans=new int[n+1][r+1];
        ans[0][0]=1;
        ans[1][0]=1;
        ans[1][1]=1;

        for(int i=2;i<=n;i++)
        {
            System.out.println("i= "+i);

            for(int j=0;j<=r;j++)
            {
                System.out.println("j= "+j);
                System.out.println("i,j "+ans[i][j]);


                if(j==0 || j==i)
                { ans[i][j]=1;
                    System.out.println("if "+ans[i][j]);}
                else
                { ans[i][j]=(ans[i-1][j-1]%m+ans[i-1][j]%m)%m;
                    System.out.println("else "+ans[i][j]);}


            }

        }
        return ans[n][r]%m;

    }
}
