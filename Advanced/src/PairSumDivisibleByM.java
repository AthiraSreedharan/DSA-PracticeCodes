import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PairSumDivisibleByM {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(11);
        //A.add(5);
        int B = 28;
        System.out.println(solve(A, B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int r = A.get(i) % B;
            //map.put(r, map.getOrDefault(r, 0) + 1);
            if(map.containsKey(r))
                map.replace(r,map.get(r)+1);
            else
                map.put(r,0);
        }
        for (Map.Entry<Integer, Integer> set :
                map.entrySet())// Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());

        ans = (map.get(0) * (map.get(0) - 1)) / 2;

        int i = 1;
        int j = B - 1;
        while (i < j) {
            ans += map.get(i) * map.get(j);
            i++;j--;
        }
        if (B % 2 == 0) {
            ans += (map.get(i) * (map.get(i) - 1)) / 2;
        }

        return ans;
    }
}



