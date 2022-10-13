/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1 };
		
		int sum=11;
		
		System.out.println(getPairs(arr ,sum));
	}
	// Can be used in any case with duplicates present in array also in case of distinct elements in array
	public static int getPairs(int arr [] , int sum)
	{
	      HashMap<Integer,Integer> map= new HashMap<>();
	      
	      int count=0;
	     
	      for(int i=0;i<arr.length;i++)
	      {
	          int value=sum-arr[i];
	          
	          if(map.get(value)!=null && value!=arr[i])
	          {
	              count=count+map.get(value);
	          }
	          if(map.get(arr[i])!=null)
	          {
	              map.put(arr[i],map.get(arr[i])+1);
	          }
	          else
	          map.put(arr[i],1);
	      }
	      return count;
		  
		  
	}
}
// another approach using sets but only used when there are no duplicate elements in an array
/*
static void sumpair(int arr [] , int sum)
    {
        HashSet<Integer> s=new HashSet<>();
         int count=0;
        for(int i=0; i<arr.length;i++)
        {
            int temp= sum-arr[i];
            if(s.contains(temp))
            {  
			      count++;
            }
            
            s.add(arr[i]);
            
        }
        System.out.println("total pairs are : "+count);
    }
	*/
