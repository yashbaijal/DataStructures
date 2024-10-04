/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// First and Last Occurence of an element in Array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int firstOcc(int [] arr, int size, int key)
    {
        int start=0;
        int end=size-1;
        int first=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==key)
            {
                first=mid;
                end=mid-1; // to check if any other lower index is available
            }

            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else if(arr[mid]>key) {
                end=mid-1;
            }
        }
        return first;
    }

    public  static int lastOcc(int [] arr, int size, int key)
    {
        int start=0,end=size-1;
        int last=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==key)
            {
                last=mid;
                start=mid+1;
            }

            if(arr[mid]<key)
            {
                start=start+1;
            }
            else if(arr[mid]>key)
            {
                end=mid-1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,3,3,3,3,3,5};
        int first= firstOcc(arr,arr.length,3);
        int last= lastOcc(arr,arr.length,3);
        System.out.println(first+" ===== "+last);
    }
}
