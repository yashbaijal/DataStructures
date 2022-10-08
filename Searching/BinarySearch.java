/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Binary Search  TC= O(log n)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int binarySearch(int [] arr,int size,int key)
    {
        int start=0;
        int end=size-1;
        
        int mid=(start+end)/2;
        
        while(start<=end)
        {
            if(arr[mid]==key)
            {
                return mid;
            }
            
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
           // mid=(start+end)/2;
           mid=start+(end-start)/2;
        }
        return -1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={2,4,6,8,12,18};
	    int pos=binarySearch(arr,arr.length,12);
	    System.out.println(pos);
	}
}
