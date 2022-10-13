/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Duplicate in an array Approach 1 : O(n),O(1) applicable only if 1<= array[i]<=n  where n is size of an array.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr = {4,3,2,7,8,2,3,1};
		System.out.println(printnum(arr));
	}
	
	public static List<Integer> printnum(int arr [])
	{
	    List<Integer> output= new ArrayList();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        int index=Math.abs(arr[i])-1;
	        
	        if(arr[index]<0)
	        output.add(index+1);
	        
	        arr[index]=-arr[index];
	    }
	    
	      return output;
	}
}
