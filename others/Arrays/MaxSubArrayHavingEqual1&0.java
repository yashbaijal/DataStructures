/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Largest Subarray having equal 1's and 0's.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={1,0,0,1,0,1,1};
		maxSubarray(arr);
	}
	
	public static void maxSubarray(int arr [])
	{
	    int start=0;
	    int end=0;
	    int curr_sum=0;
	    int max_size=0;
	    
	    HashMap<Integer ,Integer> map=  new  HashMap<>();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        
	        if(arr[i]==0)
	        {
	           curr_sum+=-1; 
	        }
	        else
	        {
	            curr_sum+=1;
	        }
	        
	        
	        if(curr_sum==0)
	        {
	            start=0;
	            end =i;
	            max_size =i+1;
	        }
	        
	        if(map.containsKey(curr_sum))
	        {
	            int s= i- map.get(curr_sum);
	            
	            if(s>max_size)
	            {
	                max_size=s;
	                start= map.get(curr_sum)+1;
	                end = i;
	            }
	        }
			
			if(!map.containsKey(curr_sum))
				map.put(curr_sum,1);
				
	        
	    }
	    System.out.println("Max Sub Array having equal 1's & 0's found of size : "+max_size+" from :"+start+" to "+end);
	}
}
