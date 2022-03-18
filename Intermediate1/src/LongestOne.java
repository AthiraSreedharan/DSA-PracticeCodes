public class LongestOne
{
    public static void main(String[] args)
    {
        String A="111011101";
        System.out.println(solve(A));

    }
    public static int solve(String A)
    {
        char[] arr=new char[A.length()];
        for(int i=0;i<A.length();i++)
            arr[i]=A.charAt(i);
        int length=Integer.MIN_VALUE;
        int left=0,right=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
                count++;
        }
        //System.out.println("count "+count);
        //System.out.println("array lenegth "+arr.length);

        if(count==arr.length)
            return count;

        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]=='0')
                {
                    left=0;
                    for(int j=i-1;j>=0;j--)
                    {
                        if(arr[j]=='1')
                            left++;
                        else
                            break;
                    }
                    //System.out.println("left "+left);

                    right=0;
                    for(int j=i+1;j<arr.length;j++)
                    {
                        if(arr[j]=='1')
                            right++;
                        else
                            break;
                    }
                    //System.out.println("right "+right);

                }
                if(count > left+right)
                    length=Math.max(length,left+right+1);
                else
                    length=Math.max(length,left+right);
            }
        }
        return length;

    }
}
