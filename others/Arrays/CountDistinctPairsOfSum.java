/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr ={1,1,2,45,46,46};
		
		int sum=47;
		
		System.out.println(countDistintPairs(arr,sum));
	}
	
	public static int countDistintPairs(int arr [] ,int  sum)
	{
	    HashMap<Integer ,Integer> m= new HashMap<>();
	    
	    int count=0;
	    
	    for(int i=0; i<arr.length; i++)
	    {
	        int value=sum-arr[i];
	        if(m.containsKey(value) && m.get(value)>0)
	        {
	            count+=1;
	            m.put(value,0);
	            m.put(arr[i],0);
	        }
	        if(m.get(arr[i])==null && m.get(value)==null)
	        m.put(arr[i],1);
	    }
	    return count;
	}
}
