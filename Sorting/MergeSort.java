/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// Merge Sort TC=O(nlogn) SC=0(n)
// The main concept behind Merge Sort is to break the array into single element arrays then merge them 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void merge(int arr [] ,int s, int e)
    {
        int mid=(s+e)/2;
        
        int len1=mid-s+1;
        int len2=e-mid;
        
        int [] arr1=new int[len1];
        int [] arr2=new int[len2];
        
        int inputArrIdx=s;
        
        for(int i=0;i<len1;i++)
        {
            arr1[i]=arr[inputArrIdx++];
        }
        
        for(int i=0;i<len2;i++)
        {
            arr2[i]=arr[inputArrIdx++];
        }
        
        inputArrIdx=s;
        
        int idx1=0,idx2=0;
        
        while(idx1<len1 && idx2<len2)
        {
            if(arr1[idx1]<arr2[idx2])
            {
                arr[inputArrIdx++]=arr1[idx1++];
            }
            else{
                arr[inputArrIdx++]=arr2[idx2++];
            }
        }
        
        while(idx1<len1)
        {
            arr[inputArrIdx++]=arr1[idx1++];
        }
        
        while(idx2<len2)
        {
            arr[inputArrIdx++]=arr2[idx2++];
        }
    }
    public static void mergeSort(int arr [] ,int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        
        int mid=(s+e)/2;
        
        mergeSort(arr, 0,mid); // to sort left array
        mergeSort(arr,mid+1,e); // to sort right array
        
        merge(arr,s,e);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={8,9,2,5,1};
		int n=arr.length;
		
		mergeSort(arr,0,n-1);
		
		for(int i:arr)
		{
		    System.out.print(i+" ");
		}
	}
}
