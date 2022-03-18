public class flip {
    public static void main(String[] args) {
        String A="010";
        int[] B=solve(A);

    }
    public static int[] solve(String A)
    {
        int[] temp=new int[A.length()];
        for(int i=0;i<A.length();i++)
        {
            temp[i]=A.charAt(i)=='0'?1:-1;
        }
        int maxSum=temp[0];
        int sum=temp[0];
        int left=0;
        int right=0;
        int tempLeft=0;
        int tempRight0;

        for(int i=1;i<temp.length;i++)
        {
            sum+=temp[i];
        }





        return temp;

    }

}
