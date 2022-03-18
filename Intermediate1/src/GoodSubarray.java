import java.util.ArrayList;
import java.util.Scanner;

public class GoodSubarray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();

        System.out.println("\n"+"final count = " + solve(A, B));
    }

    public static int solve(ArrayList<Integer> A, int B)
    {
        int count = 0;
        int N = A.size();

        for (int i = 0; i < N; i++)
        {
            int sum = 0;
            for (int j = i; j < N; j++)
            {
                System.out.println("j= " + j);
                System.out.println("A[j]= " + A.get(j));
                sum += A.get(j);
                System.out.println("sum= " + sum);
                if ((j - i + 1) % 2 == 0 && sum < B) {
                    count++;
                    System.out.println("even count= " + count);
                } else if ((j - i + 1) % 2 > 0 && sum > B) {
                    count++;
                    System.out.println("even count= " + count);
                }
            }
        }
        return count;
    }
}
