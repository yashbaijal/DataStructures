/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Subarray sum's up to 0 . This approach printSub1 can also be used with any type of sbarray equal 
// to sum question , however this is useful and should be used only when subarray sum =0. 
// As for other data printSub is efficient any easy.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={0,6, 3, -1, -3, 4, -2, 2,
             4, 6, -12, -7};
             
        int sum=0;
        
        printSub1(arr, sum);
	}
	
	public static void printSub(int arr [] , int sum)
	{
	    int currSum=0;
	    
	    
	    HashMap<Integer , Integer> map = new HashMap();
	    
	    for(int i=0; i<arr.length;i++)
	    {
	        currSum=currSum+arr[i];
	        
	        if(currSum==sum)
	        {  
	            
	            System.out.println("Sub array found at :"+0+" "+i);
	            
	            
	        }
	        
	        if(map.containsKey(currSum-sum))
	        {
	            
	            System.out.println("Sub array found at :"+(map.get(currSum-sum)+1)+" "+i);
	        }
	        
	        map.put(currSum,i);
	    }
	    
	    
	}
	
	public static void printSub1(int arr [] , int sum)
	{
	    int currsum=0;
	    
	    
	    HashMap<Integer , List<Integer>> map = new HashMap();
	    
	    map.put(currsum, new ArrayList<Integer>());
	    map.get(currsum).add(-1);
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        currsum+=arr[i];
	        
	        if(map.containsKey(currsum))
	        {
	            List<Integer> l=map.get(currsum);
	            for(int a: l)
	            {
	              System.out.println("Sub array found at :"+(a+1)+" "+i);  
	            }
	            map.get(currsum).add(i);
	        }
	        
	        else
	        {
	            map.put(currsum ,new ArrayList<Integer>());
	            map.get(currsum).add(i);
	        }
	    }
	}
}
