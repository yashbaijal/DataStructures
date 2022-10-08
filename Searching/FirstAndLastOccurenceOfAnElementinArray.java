/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// First and Last Occurence of an element in Array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int firstOcc(int [] arr,int size,int key)
    {
        int start=0;
        int end=size-1;
        int ans=-1;
        int mid=(start+end)/2;
        
        while(start<=end)
        {
            if(arr[mid]==key)
            {
                ans=mid;
                end=mid-1;
            }
            
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else if(key < arr[mid]){
                end=mid-1;
            }
            
           // mid=(start+end)/2;
           mid=start+(end-start)/2;
        }
        return ans;
    }
    
    public static int lastOcc(int [] arr,int size,int key)
    {
        int start=0;
        int end=size-1;
        int ans=-1;
        int mid=(start+end)/2;
        
        while(start<=end)
        {
            if(arr[mid]==key)
            {
                ans=mid;
                start=mid+1;
            }
            
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else if(key < arr[mid]){
                end=mid-1;
            }
            
           // mid=(start+end)/2;
           mid=start+(end-start)/2;
        }
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={1,2,3,3,3,3,3,3,5};
		int first=firstOcc(arr,arr.length,3);
		int last=lastOcc(arr,arr.length,3);
		
		System.out.println(first+"----------"+last);
	    
	}
}
