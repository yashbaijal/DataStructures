/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Intersection of two arrays.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    public static int [] intersection(int arr1 [], int arr2[])
    {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res =new HashSet<>();
        
        for(int i:arr1)
        {
            set.add(i);
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            
            if(set.contains(arr2[i]))
            {
              res.add(arr2[i]);  
            }
        }
        
        int [] output=new int[res.size()];
        
        int i=0;
        for(int a:res)
        {
            output[i]=a;
            i++;
        }
        
        return output;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr1 ={7,1,5,2,3,6};
		int [] arr2= {3,8,6,20,7};
		
		for(int i:intersection(arr1,arr2))
		{
		   System.out.println(i+" "); 
		}
	}
}
