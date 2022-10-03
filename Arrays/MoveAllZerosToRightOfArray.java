/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Move all zeros to right of array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void move(int arr[])
    {
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                swap( arr ,j,i);
                i++;
            }
        }
    }
    
    public static void  swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]={0,1,0,3,12};
		move(arr);
		
		for(int a:arr)
		{
		    System.out.print(a+" ");
		}
	}
}
