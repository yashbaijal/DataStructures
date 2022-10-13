/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Common elements in three sorted array where each array have duplicate elements.
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int ar1[] = {1, 5, 5};
     int ar2[] = {3, 4, 5, 5, 10};
     int ar3[] = {5, 5, 10, 20};
     
     findCommon(ar1,ar2,ar3);
	}
	
	public static void findCommon(int arr1 [] ,int arr2 [] ,int arr3 [])
	{
	    int i=0 ,j=0 ,k=0;
	    
	    int prev1=0;
	    int prev2=0;
	    int prev3=0;
	    
	    while(i<arr1.length && j<arr2.length && k<arr3.length)
	    {
	        while(i<arr1.length && arr1[i]==prev1)
	        {
	            i++;
	        }
	        
	         while(j<arr2.length && arr2[j]==prev2)
	        {
	            j++;
	        }
	        
	         while(k<arr3.length && arr3[k]==prev3)
	        {
	            k++;
	        }
	        
	        if(i<arr1.length && j<arr2.length && k<arr3.length)
	        {
	            
	        if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
	        {
	            System.out.print(arr1[i]+" ");
	            prev1=arr1[i];
	            prev2=arr2[j];
	            prev3=arr3[k];
	            
	            i++;
	            j++;
	            k++;
	        }
	        else if(arr1[i]<arr2[j])
	        {
	            prev1=arr1[i];
	            i++;
	        }
	        else if(arr2[j]<arr3[k])
	        {
	            prev2=arr2[j];
	            j++;
	        }
	        else
	        {
	            prev3=arr3[k];
	            k++;
	        }
	    }
	    
	    }
	}
}
