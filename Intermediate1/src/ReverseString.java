public class ReverseString
{
    public static void main(String[] args)
    {
        String A="the sky is blue";
        StringBuilder sb=new StringBuilder(A);
        sb.reverse();
        System.out.println(sb.toString());

        int s=0;
        int e=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==' ')
            {
                e=i-1;

                while(s<e)
                {
                    char temp=sb.charAt(s);
                    sb.setCharAt(s,sb.charAt(e));
                    sb.setCharAt(e,temp);
                    s++;e--;
                }
                s=i+1;
            }

            if(i==sb.length()-1)
            {
                e=i;
                while(s<e)
                {
                    char temp=sb.charAt(s);
                    sb.setCharAt(s,sb.charAt(e));
                    sb.setCharAt(e,temp);
                    s++;e--;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
