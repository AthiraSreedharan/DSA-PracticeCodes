public class StringOperations
{
    public static void main(String[] args)
    {
        String A="lLdfRVCgbkND";
        System.out.println(solve(A));

    }
    public static String solve(String A)
    {
        StringBuilder sb=new StringBuilder(A);
        String str="#";
        for(int i=0;i<sb.length();i++)
        {
            System.out.println("i ="+i);
            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
            {sb.deleteCharAt(i);
                i=i-1;
                System.out.println("1 "+sb);}
            //

            else if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i'||sb.charAt(i)=='o' ||sb.charAt(i)=='u')
            {
                sb.setCharAt(i,'#');
                System.out.println("2 "+sb);
            }
        }
        sb.append(sb);
        String ans=sb.toString();
        return ans;
    }
}
//ldfgbkldfgbk
//ldfgbkldfgbk