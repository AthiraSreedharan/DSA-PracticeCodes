import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class testProject {
    public static void main(String[] args) {
        //int A=99;
        //System.out.println(colorful(A));
        int[] A={1,2,3,4,5};
        int n=A.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                System.out.print(A[k]+" ");
            }
            System.out.println();
        }


    }
}
