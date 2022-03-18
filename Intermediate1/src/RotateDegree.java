public class RotateDegree {
    public static void main(String[] args) {
        int[][] A = {{1, 2,3}, {0, 4,5},{6,7,8}};
        int N = A.length;
        int temp = A[0][0];

        for (int i = 0; i < N - 1; i++) {
            for (int j = 1; j < N; j++) {
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i;j<N-1-i;j++)
            {





            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
}