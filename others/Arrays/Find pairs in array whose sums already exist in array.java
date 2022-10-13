/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Find pairs in array whose sums already exist in array.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int[] arr = { 10, 4, 8, 13, 5 };
		 pair(arr);
	}
	
	public static void pair(int arr [])
	{
	    int n= arr.length;
	    
	    boolean found=false;
	    
	    HashSet<Integer> set=new HashSet<>();
	    
	    for(int e:arr)
	    {
	        set.add(e);
	        
	    }
	    
	    for(int i=0;i<n-1;i++)
	    {    
	       
	        for(int j=i+1;j<n;j++)
	        {
	            if(set.contains(arr[i]+arr[j]))
	            {
	                System.out.println(arr[i]+" "+arr[j]);
	                found=true;
	            }
	        }
	    }
	    if(found==false)
	    {
	        System.out.println("No");
	    }
	}
}
