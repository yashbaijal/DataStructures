/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Quick Sort TC=O(nlogn) SC=o(n)
class Codechef
{
    public static void  quickSort(int arr [],int s, int e)
    {
        if(s>=e)
        return;
        
        int p=partition( arr,s,e);
        
        quickSort(arr,0,p-1);
        
        quickSort(arr,p+1,e);
    }
    
    public static int partition(int arr [],int s,int e)
    {
        int pivot=arr[s];
        int count=0;
        
        for(int i=s+1;i<=e;i++)
        {
           if(arr[i] <= pivot)
                count++;
        }
        
        int pivotIdx=s+count;
        
        swap(arr,s,pivotIdx);
        
        int sIdx=s;
        int eIdx=e;
        
        while(sIdx<pivotIdx && eIdx>pivotIdx)
        {
            
            while(arr[sIdx]<=pivot)
            {
                sIdx++;
            }
            
            while(arr[eIdx]>pivot)
            {
                eIdx--;
            }
            
            if(sIdx<pivotIdx && eIdx>pivotIdx)
            {
                swap(arr,sIdx++,eIdx--);
            }
        }
        
        return pivotIdx;
    }
    
    public static void swap(int [] arr,int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={80,30,90,40,50,70};
		int n=arr.length;
		
		quickSort(arr,0,n-1);
		
		for(int i:arr)
		{
		    System.out.print(i+" ");
		}
	}
}
