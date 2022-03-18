import java.util.ArrayList;
import java.util.Scanner;

public class BitCompression
{
    public static void main(String[] args) {
         ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {A.add(sc.nextInt());}
        System.out.println(compressBits(A));
    }


    public static int compressBits(ArrayList<Integer> A)
    {
        int N=A.size();

        int i=0;
        int j=1;

        while(i<N-1 && i<j && j<N)
        {
            int temp=A.get(i);
            System.out.println("temp "+temp);
            A.set(i,A.get(i) & A.get(j));
            System.out.println("i "+A.get(i));
            A.set(j,temp | A.get(j));
            System.out.println("j "+A.get(j));
            i++;
            j++;
        }
        for(int k=0;k<A.size();k++)
            System.out.print(A.get(k));

        System.out.println();
        int r=A.get(0);
        for(int k=1;k<A.size();k++)
            r=r^A.get(k);

        return r;
    }

}
