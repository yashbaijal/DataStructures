/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr ={2,2,2,2,5,5,2,3,3};
		int n= arr.length;
		
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int i=0 ; i<arr.length;i++)
		{
		    if(map.containsKey(arr[i]))
		    {
		        map.put(arr[i], map.get(arr[i])+1);
		    }
		    else
		    {
		        map.put(arr[i],1);
		    }
		}
		
		for(Integer i:map.keySet())
		{
		    int count=map.get(i);
		    
		    if(count>n/2)
		    {
		        System.out.println("majority Element :"+i);
		        break;
		    }
		    else
		    System.out.println("No majority Element");
		}
	}
}
