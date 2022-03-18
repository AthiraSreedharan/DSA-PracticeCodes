import java.util.HashMap;
import java.util.Map;

public class HashingCheckPalindrome
{
    public static void main(String[] args)
    {
        String A="yzfbzbyyrurquqf";
        System.out.println(solve(A));

    }
    public static int solve(String A)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=A.length();
        char[] arr=new char[len];
        int count=0;
        for(int i=0;i<len;i++)
        {
            arr[i]=A.charAt(i);
        }

        for(int i=0;i<len;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Character,Integer> set :map.entrySet())
        {
            System.out.println(set.getKey()+" "+set.getValue());
        }

        for(int i=0;i<len;i++)
        {
            //System.out.println(i+" count "+count);
            if(map.containsKey(arr[i]))
            {
                if(map.get(arr[i])%2 >0){
                count++;}
                map.remove(arr[i]);
            }
        }
       // System.out.println("count "+count);
        if(count>1)
            return 0;
        else
            return 1;
    }
}

