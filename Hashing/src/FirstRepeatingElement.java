import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of first occurrence is smallest.
If there is no repeating element, return -1.
 */
public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of first array");
        int N=sc.nextInt();
        ArrayList<Integer> A=new ArrayList<Integer>();
        for(int i=0;i<N;i++)
            A.add(sc.nextInt());

        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A)
    {
        int N=A.size();
        HashMap<Integer,Integer> map=new HashMap<>();
        int index=-1;
        for(int i=N-1;i>=0;i--)
        {
            if(map.containsKey(A.get(i)))
                index=i;
            else
            map.put(A.get(i),map.getOrDefault(A.get(i),0+1));
        }
        if(index==-1)
            return -1;
        else
            return A.get(index);
    }
}
