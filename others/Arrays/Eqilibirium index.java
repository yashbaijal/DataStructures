/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Eqilibirium index (Sum of lower indexes is equal to sum of higher indexes)

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={-7,5,1,2,-4,3,0};
		
		System.out.println(equilibirium(arr));
	}
	
	public static int equilibirium(int [] arr)
	{
	    int sum=0;
	    int leftsum=0;
	    
	    for (int i=0;i<arr.length;i++)
	    {
	        sum+=arr[i];
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        sum-=arr[i];
	        
	        if(leftsum==sum)
	        {
	            return i;
	        }
	        
	        leftsum+=arr[i];
	    }
	    
	    return -1;
	}
}
