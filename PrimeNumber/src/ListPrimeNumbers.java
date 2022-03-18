import java.sql.SQLOutput;
import java.util.Scanner;

public class ListPrimeNumbers {
    public static void main(String[] args) {

        int N;
        int i;
        int j=3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        N=sc.nextInt();
        System.out.println("List of Prime Numbers from 1 to "+N+" are");


        for (i=2;i<=N;i++)
        {
            int flag=0;
            for(j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    //System.out.println(i+" is not prime");
                    flag=1;
                    break;
                }
            }

            if(flag==0)
            {
                System.out.println(i);
            }
        }

    }
}