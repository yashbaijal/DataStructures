/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Sort 0 1 2 in an array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void sort(int [] arr)
    {
        int start=0,mid=0;
        int end=arr.length-1;
        int pivot=1;
        
        while(mid<=end)
        {
            if(arr[mid]<pivot)
            {
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid]>pivot)
            {
                swap(arr,mid,end);
                end--;
            }
            else{
                mid++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void swap(int [] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
         sort(arr);
	}
}
