public class Frequesncy
{
    public static void main(String[] args)
    {
        /*
        int[] arr={1,6,1,1,1,3};
        int value=0;
        int N=arr.length;

        for(int i=0;i<N;i++)
        {
            int count=0;
            for(int j=0;j<N;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>N/2)
            {value=arr[i];
                break;}
        }
        System.out.println(value);

*/
        int[] A={1,6,1,1,8,3,3,3,3,3,3};
        int count=0;
        int element=A[0];
        int frequency=1;
        for(int i=1;i<A.length;i++)
        {
            if(A[i]==element)
                frequency++;
            else if(frequency==0)
                element=A[i];
            else
                frequency--;
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==element)
                count++;
        }
        if(count>A.length/2)
            System.out.println(element);
    }
}
