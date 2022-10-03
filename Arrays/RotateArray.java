/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Rotate an array
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int[] rotate(int arr[],int k)
    {
        int [] temp=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            temp[(i+k)%arr.length]=arr[i];
        }
        
        return temp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]={1,2,3,4,5,6,7};
		arr=rotate(arr,3);
		
		for(int a:arr)
		{
		    System.out.print(a+" ");
		}
	}
}
