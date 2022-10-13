/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Maximum produvt subarray
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int solution(int [] arr)
    {
        int prod1=arr[0],prod2=arr[0],result=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            int temp=Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2=Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
            prod1=temp;
            
            result=Math.max(result,prod1);
        }
        return result;
    }
	// New Approach
	long maxProduct(int[] arr, int n) {
        long result=arr[0],max=result,min=result;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                long temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i],max*arr[i]);
            min=Math.min(arr[i],min*arr[i]);
            result=Math.max(result,max);
        }
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={1,-2,-3,0,7,-8,-2};
	System.out.println(solution(arr));
	}
}
