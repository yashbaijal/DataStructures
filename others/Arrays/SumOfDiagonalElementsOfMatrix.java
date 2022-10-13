/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Sum of diagonal elements of a matrix

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int n=5;
		diagnol(arr,n);
		
	}
	
	public static void diagnol(int [][] mat , int n )
	{
	    int diagonal1=0;
	    int diagonal2=0;
	    
	    for(int i=0;i<n;i++)
	    {
	        diagonal1+=mat[i][i];
	        diagonal2+=mat[i][n-i-1];
	    }
	    
	    System.out.println("Sum of diagonal1 : "+diagonal1);
	    System.out.println("Sum of diagonal2 : "+diagonal2);
	}
}
