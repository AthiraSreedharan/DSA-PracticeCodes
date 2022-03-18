import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingKOccurrences
{
    public static void main(String[] args)
    {
        ArrayList<Integer> C = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K=sc.nextInt();
        for (int i = 0; i < N; i++) {
            C.add(sc.nextInt());
        }
        long r = getSum(N,K,C);
        System.out.println(r);

    }
    public static long getSum(int N, int K, ArrayList<Integer> C)
    {
        int n=C.size();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(C.get(i),map.getOrDefault(C.get(i),0)+1);
        }


        long sum=0;
        int flag=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==K)
            {
                sum += e.getKey();
                flag=1;
            }
        }
        if(flag==0)
            return -1;
        else
            return sum;
    }
}
