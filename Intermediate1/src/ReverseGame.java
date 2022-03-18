import java.util.Scanner;

public class ReverseGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        if(B>N)
            B=B%N;
        int s=0;
        int e=N-1;
        while(s<e)
        {
            A[s]=A[s]+A[e];
            A[e]=A[s]-A[e];
            A[s]=A[s]-A[e];
            s++;
            e--;
        }
        for(int i=0;i<N;i++)
        {
            System.out.print("reverse "+A[i]+" ");
        }

        s=0;
        e=B-1;
        while(s<e)
        {
            A[s]=A[s]+A[e];
            A[e]=A[s]-A[e];
            A[s]=A[s]-A[e];
            s++;
            e--;
        }
        for(int i=0;i<N;i++)
        {
            System.out.print("first "+A[i]+" ");
        }
        s=B;
        e=N-1;
        while(s<e)
        {
            A[s]=A[s]+A[e];
            A[e]=A[s]-A[e];
            A[s]=A[s]-A[e];
            s++;
            e--;
        }
        for(int i=0;i<N;i++)
        {
            System.out.print("second "+A[i]+" ");
        }


    }

}
