/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Check if Array is Sorted Rotated
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean isSortedRotated(int arr[])
    {
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0])
        {
            count++;
        }
        
        return count<=1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	int arr[]={3,4,5,1,2};
		
	if(isSortedRotated(arr))
	{
	    System.out.println("Input array is sorted rotated");
	}
	else{
	    System.out.println("Input array is not sorted rotated");
	}
	}
}
