public class Dish
{
    public static void main(String[] args) {
        int A[]={1,3,7,4};
        int B=5;
        int C=8;
        System.out.println("ans "+solve(A,B,C));
    }
    public static int solve(int[] A, int B, int C) {
        int N = A.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] > max)
                max = A[i];
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    sum += A[i] + A[j];
                    if (sum >= B && sum <= C) {
                        for (int k = i; k <= j; k++) {
                            if (A[k] == 0 || A[k] == 1)
                                continue;

                            else {
                                int l = 2;
                                while (l * l < max) {
                                    if ((A[k] % i != 0)) {
                                        count++;
                                        break;
                                    } else
                                        l--;
                                }
                            }
                        }

                    }
                }

            }

        }
        return count;
    }
}
