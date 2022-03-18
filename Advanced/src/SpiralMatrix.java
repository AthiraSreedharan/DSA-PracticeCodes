public class SpiralMatrix {
    public static void main(String[] args) {
        int A=4;
        generateMatrix(A);
    }
    public static int[][] generateMatrix(int A) {

        int[][] r=new int[A][A];
        int i=0;
        int j=0;
        int k=1;
        int N=A;
        int n=0;
        if(A==1)
        {
            r[0][0]=1;
        }
        else
        {
            while(k<=N*N)
            {
                n=0;
                System.out.println("1 j,k,i "+j+" "+k+" "+i);
                while(n<A-1)
                {
                    r[i][j]=k;
                    k++;j++;
                }
                n=0;
                System.out.println("2 j,k,i "+j+" "+k+" "+i);
                while(n<A-1)
                {
                    r[i][j]=k;
                    k++;i++;
                }
                System.out.println("3 j,k,i "+j+" "+k+" "+i);
                while(j>0)
                {
                    r[i][j]=k;
                    k++;j--;
                }
                System.out.println("4 j,k,i "+j+" "+k+" "+i);
                while(i>0)
                {
                    r[i][j]=k;
                    k++; i--;
                }
                System.out.println("a j,k,i "+j+" "+k+" "+i);
                i++;j++;
                System.out.println("b j,k,i "+j+" "+k+" "+i);
                A=A-2;
                if(A==1)
                {r[i][j]=k;break;}


            }
        }



        for(int m=0;m<N;m++)
        {
            for(int l=0;n<N;n++) {

                System.out.print(r[m][l]+" ");
            }
           System.out.println();
        }
return r;

    }

}
