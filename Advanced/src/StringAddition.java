public class StringAddition {
    public static void main(String[] args) {
        String A="1010110111001101101000";
        String B="1000011011000000111100110";
        System.out.println(addBinary(A,B));

    }
        public static String addBinary(String A,String B)
        {
            int n=A.length()-1;
            int m=B.length()-1;
            StringBuilder ans=new StringBuilder();
            int sum=0;
            int carry=0;


            while(n>=0 || m>=0)
            {
                int a=0,b=0;
                if(n>=0)
                a=A.charAt(n)-'0';
                if(m>=0)
                b=B.charAt(m)-'0';

                sum=a+b+carry;
                carry=sum/2;
                ans=ans.append(sum%2);
                //System.out.println(ans);
                n--;
                m--;
            }
            return ans.reverse().toString();

        }
}

