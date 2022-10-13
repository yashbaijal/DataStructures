/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr ={1,2,6,10,11,15};
		minSum(arr);
	}
	
	public static void minSum(int arr [])
	{
	    int n=arr.length;
	    int res=1;
	    
	    for(int i=0;i<n && arr[i]<=res;i++)
	    {
	        res=res+arr[i];
	    }
	    
	    System.out.println("Min number that can't be formed by sum of elements of subset of an array is :"+res);
	}
}


