import java.lang.*;
import java.util.*;

public class SecondLargest {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output

            Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
            for(int k=0;k<T;k++)
            {
                int max=Integer.MIN_VALUE;
                int secMax=Integer.MIN_VALUE;

                int L=sc.nextInt();
                int[] A=new int[L];
                for(int i=0;i<L;i++)
                {
                    A[i]=sc.nextInt();
                }

                if(L==1 || L==0)
                {
                    System.out.println(-1);
                }
                else
                {
                    for(int i=0;i<L;i++)
                    {
                        if(A[i]>max)
                        {
                            max=A[i];
                        }
                    }
                    for(int i=0;i<L;i++)
                    {
                        if(A[i]!=max && A[i]>secMax)
                        {
                            secMax=A[i];
                        }
                    }
                    System.out.println(secMax);
                }
            }

        }
    }
