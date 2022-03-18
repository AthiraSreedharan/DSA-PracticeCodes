import java.util.ArrayList;
import java.util.List;

public class BitManipulation {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);

        System.out.println(singleNumber(A));

    }

    public static int singleNumber(final List<Integer> A) {
        int ans=0;

        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int j=0;j<A.size();j++)
            {
                System.out.println("1"+checkbit(A.get(j),i));
                if(checkbit(A.get(j),i)==true)
                {
                    count++;
                }
            }
            System.out.println(count);
            if((count&1)==1)
                ans=ans|(1<<i);
            System.out.println("ans"+ans);
        }
        return ans;
    }
    public static boolean checkbit(int a,int b)
    {
        if((a&(1<<b))>0)
            return true;
        else
            return false;
    }
}


