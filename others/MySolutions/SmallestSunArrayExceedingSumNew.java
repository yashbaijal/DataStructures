/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  if( dotestspass() )
  {
    System.out.println("All tests pass\n");
  }
  else
  {
    System.out.println("There are test failures\n");
  }
	}
	
	static int subArrayExceedsSum(int [] arr  , int x)
	{
	    int n=arr.length;
	    
	    if(x<=0)
	    return 0;
	    
	    if(n<1)
	    return -1;
	    
	    
	    
	    int minlen=n+1;
	    int sum=0;
	    int start=0,end=0;
	    
	    while(end<n)
	    {
	        while(sum<=x && end<n)
	        {
	            sum+=arr[end++];
	        }
	        
	        while(sum>x && start<end)
	        {
	            if((end-start)<minlen)
	            minlen=end-start;
	            
	            sum-=arr[start++];
	            
	        }
	    }
	    
	    return minlen;
	}
	
	static boolean dotestspass()
	{
	    boolean result=true;
	    int [] arr1={1,4,45,6,0,19};
	 
	    result=result && subArrayExceedsSum(arr1 ,51)==3;
	    System.out.println(subArrayExceedsSum(arr1 ,51));
	    int [] arr2={};
	    result=result && subArrayExceedsSum(arr2 ,51)==-1;
	    int [] arr3={1,2,3,4};
	    result=result && subArrayExceedsSum(arr3 ,6)==2;
	    result=result && subArrayExceedsSum(arr3 ,0)==0;
	    
	    return result;
	}
}
