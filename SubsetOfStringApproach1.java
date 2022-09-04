/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Subset of Array/String
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//String s="abc";
		
		//char [] arr=s.toCharArray();
		int [] arr={10,20,30};
		
		int limit=(int)Math.pow(2,arr.length);
		
		for(int i=0;i<limit;i++)
		{
		    String res="";
		    int temp=i;
		    for(int j=arr.length-1;j>=0;j--)
		    {
		        int r=temp%2;
		        temp=temp/2;
		        
		        if(r==0)
		        {
		            res="-\t"+res;
		        }else{
		            res=arr[j]+"\t"+res;
		        }
		    }
		    System.out.println(res);
		}
	}
}
