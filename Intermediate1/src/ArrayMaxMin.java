import java.util.Scanner;

public class ArrayMaxMin {
        public static int solve(int[] A)
        {
            int i=0;
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(i=0;i<A.length;i++)
            {
                if(A[i]%2==0)
                {
                    if(max<=A[i])
                    {
                        max=A[i];
                    }
                }
                else
                {
                    if(min>=A[i])
                    {
                        min=A[i];
                    }
                }
            }
            return (max-min);
        }




        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int[] A=new int[N];
            for(int i=0;i<N;i++)
            {
                A[i]=sc.nextInt();
            }
            System.out.println(+solve(A));
        }
    }


