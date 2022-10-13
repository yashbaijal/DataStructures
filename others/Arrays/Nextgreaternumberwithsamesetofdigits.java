/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Find next greater number with same set of digits.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    public static void findNext(int num)
    {
        String s=Integer.toString(num);
        char [] arr=s.toCharArray();
        
        int n=arr.length;
        
        int i;
        
        for(i=n-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
              break;
        }
        
        if(i==0)
        {
            System.out.println("Not Possible");
        }
        else
        {
            int x=arr[i-1] , min=i;
            
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>x && arr[j]<arr[min])
                {
                    min=j;
                }
            }
            
            swap(arr ,i-1,min);
            
            Arrays.sort(arr,i,n);
            
            System.out.print("Next number with same set of digits is : ");
            
            for(i=0;i<n;i++)
            System.out.print(arr[i]);
        }
        
    }
    
    public static void swap(char arr [] , int l ,int r)
    {
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=534976;
		findNext(n);
	}
}
