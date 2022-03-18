package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] A={ 101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        int B=202;
        System.out.println(search(A,B));

    }
    public static int search(final int[] A, int B) {
        int pivot=pivot(A,B);
        if(pivot==-1)
            return binarySearch(A,0,A.length-1,B);
        if(A[pivot]==B)
            return pivot;
        if(B>=A[0])
            return binarySearch(A,0,pivot-1,B);
        else
            return binarySearch(A,pivot+1,A.length-1,B);
    }

        public static int pivot(final int[] A, int B) {
            int N=A.length;
            int l=0;
            int h=N-1;
            int mid=0;
            while(l<=h)
            {
                mid=(l+h)/2;
                if(A[mid]>A[mid+1])
                {
                   return mid;
                }
                else if(A[mid]<A[mid-1])
                {
                   return mid-1;
                }
                else if(A[mid]<A[l])
                {
                    h=mid-1;
                    continue;
                }
                else
                {
                    l=mid+1;
                    continue;
                }
            }
            return -1;

        }
        public static int binarySearch(int[]A,int l,int h,int B)
        {
            while(l<=h)
            {
                int mid=(l+h)/2;
                if(A[mid]==B)
                    return mid;
                else if(A[mid]>B)
                    h=mid-1;
                else
                    l=mid+1;
            }
            return -1;
        }
    }


