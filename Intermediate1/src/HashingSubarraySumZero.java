import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashingSubarraySumZero {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        int r = solve(A);
        System.out.println(r);
    }

    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> pf = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        pf.add(0, A.get(0));
        if (pf.get(0) == 0)
            return 1;
        for (int i = 1; i < n; i++)
        {
            pf.add(A.get(i) + pf.get(i - 1));
            if (pf.get(i) == 0)
                return 1;
            if(map.containsKey(pf.get(i)))
                return 1;
            else
                map.put(pf.get(i),1);
        }
        return 0;
    }
}
