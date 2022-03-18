import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.charAt(0));
        //System.out.println(reverse(s));
    }
    public static String reverse(String s)
    {
        System.out.println(s);
        if(s.isEmpty())
            return s;
        return reverse(s.substring(1))+s.charAt(0);
    }
}
