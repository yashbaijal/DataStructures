/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Triplets in an sorted array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={12,3,4,1,6,9};
		int sum=24;
		triplet1(arr,sum);
		
	}
	
	public static void triplets(int arr [] , int sum)
	{
	    int n= arr.length;
	    
	    Arrays.sort(arr);
	   
	   for(int i=0;i<n;i++)
	   {
	       int l=i+1;
	       int r=n-1;
	       
	       while(l<r)
	       {
	           int currentsum=arr[i]+arr[l]+arr[r];
	           
	           if(currentsum==sum)
	           {
	               System.out.println("triplets are : "+arr[i]+","+arr[l]+","+arr[r]);
	           }
	         
	          if(currentsum<sum)
	           {
	               l++;
	           }
	           else
	           {
	           r--;
	           }
	       }
	   }
	    
	    
	}
	
	public static void triplet1(int arr [] , int sum)
	{
	    int n=arr.length;
	    
	    for(int i=0;i<n-2;i++)
	    {
	        HashSet<Integer> set=new HashSet();
	        int target=sum-arr[i];
	        
	        for(int j=i+1;j<n;j++)
	        {
	            if(set.contains(target-arr[j]))
	            {
	                System.out.println("triplets are : "+arr[i]+","+arr[j]+","+(target-arr[j]));
	            }
	            
	            set.add(arr[j]);
	        }
	    }
	   System.out.println("N0 triplet's");
	}
	
}
