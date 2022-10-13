/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Product Array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void productArray(int arr [] , int n)
    {
        int [] left= new int[n];
        int [] right= new int[n];
        int [] product=new int[n];
        
        left[0]=1;
        right[n-1]=1;
        
        for(int i=1;i<n;i++)
        {
            left[i]=arr[i-1]*left[i-1];
        }
        
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*arr[i+1];
        }
        
        for(int i=0;i<n;i++)
        {
            product[i]=left[i]*right[i];
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(product[i]+" ");
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={1,2,3,4,5};
		int n=arr.length;
		
		productArray(arr,n);
	}
}
