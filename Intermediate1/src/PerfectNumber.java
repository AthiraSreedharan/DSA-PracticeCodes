import java.util.Scanner;

public class PerfectNumber {

        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int sum = 1;
                int n = 2;
                while (n*n<=A)
                {
                    if(A%n==0)
                    {
                        sum = sum + n + A/n;
                        System.out.println("sum "+sum);
                    }
                    n++;
                    System.out.println("n "+n);

                }
                if (sum == A) {
                    System.out.println("YES");
                } else
                    System.out.println("NO");
            }
        }
    }

