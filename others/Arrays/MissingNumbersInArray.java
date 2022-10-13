/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// Print all missing numbers in an array between lowest and highest element.
class Codechef
{
    public static void printMissing(int arr [] )
    {
        int diff=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]-i!=diff)
            {
                while(diff<arr[i]-i)
                {
                    System.out.print((i+diff)+" ");
                    diff++;
                }
            }
        }
    }
    
    public static void printMissingNew(int arr [])
    {
        int N= arr.length;
        
        boolean [] b= new boolean[arr[N-1]+1];
        
        for(int i=0;i<N;i++)
        {
            b[arr[i]]=true;
        }
        
        for(int i=arr[0];i<b.length;i++)
        {
            if(b[i]==false)
            System.out.print(i+" ");
        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={6,7,10,11,13};
		
	//	printMissing(arr);
		
		printMissingNew(arr);
	}
}
