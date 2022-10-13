/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={1,0,1,0,1,0,0,1,1,0,1};
		System.out.println("Minimum Swap required to group all 1’s together : "+minSwap(arr));
	}
	
	public static int minSwap(int arr [])
	{ 
	    int n= arr.length;
	    
	    int sizeOfWindow=0;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==1)
	        sizeOfWindow++;
	    }
	    
	    int zeros=0;
	    
	    for(int i=0; i<sizeOfWindow;i++)
	    {
	        if(arr[i]==0)
	        zeros++;
	    }
	    
	    int minswaps=zeros;
	    
	    for(int i=1; i<sizeOfWindow;i++)
	    {
	        if(arr[i-1]==0)
	        {
	            zeros--;
	        }
        
        if(arr[i+sizeOfWindow-1]==0)
	        {
	            zeros++;
	        }
	        
	        minswaps=Math.min(zeros,minswaps);
        
	    }
	    return minswaps;
	}
}
