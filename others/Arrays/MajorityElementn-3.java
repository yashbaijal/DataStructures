/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Majority of element in an array having count greater than n/3 where n is aarray's length.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr ={3,1,2,3,1,2,1,3};
		System.out.println("Majority elements gerater than n/3 are :"+element(arr));
		
		System.out.println("Majority elements gerater than n/3 are :"+element( new int[]{7,7,7,3,4,4,4,5}));
		
		System.out.println("Majority elements gerater than n/3 are :"+element( new int[]{8,4,8,5,6,5,8,5}));
		
	}
	
	public static List<Integer> element(int arr [])
	{
	    int n=arr.length;
	    
	    List<Integer> l=new ArrayList<>();
	    
	    int count1=0;
	    int count2=0;
	    
	    Integer candidate1=null;
	    Integer candidate2=null;
	    
	    for(int i:arr)
	    {
	        if(candidate1!=null && i==candidate1)
	        {
	            count1++;
	        }
	        
	       else if(candidate2!=null && i==candidate2)
	        {
	            count2++;
	        }
	        
	      else if(count1==0)
	        {
	            candidate1=i;
	            count1=1;
	        }
	        
	       else if(count2==0)
	        {
	            candidate2=i;
	            count2=1;
	        }
	        
	        else
	        {
	            count1--;
	            count2--;
	        }
	        
	    }
	    count1=0;
	    count2=0;
	    
	    for(int i=0;i<n;i++)
	    {
	        if(candidate1!=null && arr[i]==candidate1)
	        count1++;
	        
	        if(candidate1!=null && arr[i]==candidate1)
	        count2++;
	        
	    }
	    
	    if(count1>n/3)
	    l.add(candidate1);
	    
	    if(count2>n/3)
	    l.add(candidate2);
	    
	    return l;
	}
}
