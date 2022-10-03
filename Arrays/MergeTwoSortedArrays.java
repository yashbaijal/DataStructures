/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Merge Two Sorted Arrays
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void merge(int arr1[],int arr2[],int arr3[])
    {
        int i=0,j=0,k=0;
        
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        
        while(i<arr1.length)
        {
          arr3[k++]=arr1[i++];
        }
        
        while(j<arr2.length)
        {
          arr3[k++]=arr2[j++];
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr1[]={1,3,5,7,9};
		int arr2[]={2,4,6};
		
		int [] arr3=new int[arr1.length+arr2.length];
		
		merge(arr1,arr2,arr3);
		
		for(int a:arr3)
		{
		    System.out.print(a+" ");
		}
	}
}
