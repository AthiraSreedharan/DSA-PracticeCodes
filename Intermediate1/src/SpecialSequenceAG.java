public class SpecialSequenceAG
{
    public static void main(String[] args)
    {
        String A="ABCGAG";
        System.out.println(solve(A));
    }
    public static int solve(String A)
    {
        int c=0;
        int N=A.length();
        //System.out.println("sol "+N);
        int ans=0;
        for(int i=N-1;i>=0;i--) {
            if (A.charAt(i) == 'G')
                c++;
            else if (A.charAt(i) == 'A')
                ans += c;
        }
        return ans;

    }
}
