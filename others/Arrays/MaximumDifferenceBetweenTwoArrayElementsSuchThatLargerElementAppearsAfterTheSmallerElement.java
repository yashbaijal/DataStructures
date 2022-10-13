/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Maximum difference between two Array elements such that larger element appears after the smaller element
//TC=O(n) ,SC=O(1)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int[] arr={3,1,4,7,5,100,10};
	   System.out.println(maxDiff(arr));
	}
	
	public static int maxDiff(int arr [])
	{
	    int minSofar=arr[0];
	    int currentDiff=0;
	    int maxdiff=Integer.MIN_VALUE;
	    
	    for(int i=1;i<arr.length;i++)
	    {
	        if(arr[i]<minSofar)
	        {
	            minSofar=arr[i];
	        }
	        else
	        {
	            currentDiff=arr[i]-minSofar;
	            maxdiff=Math.max(currentDiff,maxdiff);
	        }
	    }
	    return maxdiff;
	}
}
