import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int sum;

        for(int i=1;i<=N;i++)
        {
            sum=0;
            int x=i;
            while(x!=0)
            {
                int val=x%10;
                sum=sum+(val*val*val);
                x=x/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }

    }
}
