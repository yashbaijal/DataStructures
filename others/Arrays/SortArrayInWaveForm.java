/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Sort array in wave form ie  arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]>=.....

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void swap(int arr [], int l, int r)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    
    public static void printwave(int arr [])
    {
        int n=arr.length;
        
        Arrays.sort(arr);
        
        for(int i=0;i<n-1;i+=2)
        {
            swap(arr,i,i+1);
        }
        
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    
    public static void printwave2(int arr [])
    {
        int n=arr.length;
        
        for(int i=0;i<n-1;i+=2)
        {
            if(i>0 && arr[i-1]>arr[i])
            {
                swap(arr, i-1,i);
            }
            
            if(i<n && arr[i]<arr[i+1])
            {
                swap(arr,i,i+1);
            }
        }
        
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
		
		printwave2(arr);
	}
}
