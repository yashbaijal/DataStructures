/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Peak Index in a Mountain Array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int peak(int [] arr,int size)
    {
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        
        while(start<end)
        {
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
           mid=start+(end-start)/2;
        }
        return start;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={0,10,5,2};
		System.out.println("peak element at positon = "+peak(arr,arr.length));
	    
	}
}
