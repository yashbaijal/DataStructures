/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Search in a rotated & Sorted array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int getPivot(int [] arr,int size)
    {
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        
        while(start<end)
        {
            if(arr[mid]>=arr[0])
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
           mid=start+(end-start)/2;
        }
        return start;
    }
    
    public static int binarySearch(int [] arr,int s, int e,int key)
    {
        int start=s;
        int end=e;
        int mid=start+(end-start)/2;
        
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
            else if(key < arr[mid]){
                end=mid-1;
            }
            
            mid=start+(end-start)/2;
        }
        return -1;
    }
    
    public static int findPosition(int arr [],int size, int key)
    {
        int pivot=getPivot(arr, size);
        
        if(key>=arr[pivot] && key<=arr[size-1])
        {
            return binarySearch(arr,pivot,size-1,key);
        }
        else{
            return binarySearch(arr,0,pivot-1,key);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={7,9,1,2,3};
		System.out.println("peak element at positon = "+findPosition(arr,arr.length,3));
	    
	}
}
