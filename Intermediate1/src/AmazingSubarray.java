public class AmazingSubarray {
    public static void main(String[] args)
    {
        String A="ABEC";
        System.out.println(solve1(A));
    }
    public static int solve(String A)
    {
        int N=A.length();
        int count=0;
        //System.out.println(N);

        for(int i=N-1;i>=0;i--)
        {
            String s="";
            if(A.charAt(i)=='A' || A.charAt(i)=='E'||A.charAt(i)=='I' || A.charAt(i)=='O'||A.charAt(i)=='U' || A.charAt(i)=='a' || A.charAt(i)=='e'||A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
            {
                for(int j=i;j<N;j++)
                {
                    s=s.concat(String.valueOf(A.charAt(j)));
                    count++;
                    //System.out.println(s);
                }
            }
        }
        return count;
    }

    public static int solve1(String A)
    {
        int N=A.length();
        int sum=0;
        for(int i=0;i<N;i++)
        {
            if(A.charAt(i)=='A' || A.charAt(i)=='E'||A.charAt(i)=='I' || A.charAt(i)=='O'||A.charAt(i)=='U' || A.charAt(i)=='a' || A.charAt(i)=='e'||A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
            {
                sum+=N-i;
            }
        }
        return sum;


    }
}
