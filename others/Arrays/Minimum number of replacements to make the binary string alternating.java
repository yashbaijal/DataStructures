/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Minimum number of replacements to make the binary string alternating.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  String s="0001010111";
	  
	  int len= s.length();
	  
	  System.out.println(swaps(s,len));
	}
	
	public static int  swaps(String s , int len)
	{
	    int res=0;
	    
	    for(int i=0;i<len;i++)
	    {
	        
	        if(i%2==0 && s.charAt(i)=='1')
	        res++;
	        
	        if(i%2==1 && s.charAt(i)=='0')
	        res++;
	        
	    }
	    
	    return Math.min(res,len-res);
	    
	}
}
