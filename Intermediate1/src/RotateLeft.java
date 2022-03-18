import java.util.Scanner;

public class RotateLeft {
    public static int[][] solve(int[] A, int[] B)
    {
        int M=B.length;
        int N=A.length;
        int[][] outArray=new int[M][N];

        for (int i = 0; i < B.length; i++)
        {
            int[] tempA = new int[A.length];

            int k = B[i]%N;


            for (int a = k, b = 0; a < A.length; a++, b++)
            {
                tempA[b] = A[a];
            }
            for (int a = 0, b = N - k; a < k; a++, b++)
            {
                tempA[b] = A[a];
            }

            for (int j = 0; j < N; j++)
            {
                outArray[i][j] = tempA[j];
            }
        }
        return outArray;

    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//size of A  array
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();//size of B array
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
        {
            B[i] = sc.nextInt();
        }
        int[][] outArray=new int[M][N];
        outArray=solve(A,B);

        System.out.print("[ ");
        for(int x=0;x<M;x++)
        {
            System.out.print("[");
            for(int y=0;y<N;y++)
            {
                System.out.print(outArray[x][y]+" ");
            }
            System.out.print("]");
            if(x<M-1)
                System.out.println();
        }
        System.out.print(" ]");
    }
}
