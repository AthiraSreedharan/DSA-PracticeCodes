import java.util.Scanner;

public class SpiralPrint
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();

        int i=0;
        int j=0;
        int n=1;
        int N=A;
        int[][] S=new int[A][A];
        while(n<=A*A)
        {
            for(int k=0;k<N-1;k++)
            {
                S[i][j]=n;
                System.out.println(n);
                j++;
                n++;
            }
            for(int k=0;k<N-1;k++)
            {
                S[i][j]=n;
                System.out.println(n);
                i++;
                n+=A;
            }
            for(int k=0;k<N-1;k++)
            {
                S[i][j]=n;
                System.out.println(n);
                j--;
                n--;
            }
            for(int k=0;k<N-1;k++)
            {
                S[i][j]=n;
                System.out.println(n);
                i--;
                n-=A;
            }
            i++;
            System.out.println("i"+i);
            j++;
            System.out.println("j"+j);
            n+=A;
            System.out.println("n"+n);
            N-=2;
            System.out.println("N"+N);

        }
        for(int o=0;i<N;i++)
        {
            for(int p=0;j<N;j++)
            {
                System.out.print(S[o][p]);
            }
            System.out.println();
        }
    }
}
