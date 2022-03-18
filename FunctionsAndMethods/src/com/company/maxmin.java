package com.company;

public class maxmin {
    public static void main(String[] args) {
        int[] A={-98,54,-52,15,23,-97,12,-64,52,85};

        int min=1000000000;
        int max=-1000000000;
        int ans=0;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                if(max<A[i])
                {
                    max=A[i];
                }
            }
            else{
                if(min>A[i]) {
                    min = A[i];
                }
            }
        }
        ans=max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(ans);
    }

}
