/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static String reverseString(String s)
    {
        String [] temp=s.split(" ");
		
		String result=" ";
		
		String output=" ";
		
		int count=0;
		
		for (int i = 0; i < temp.length; i++)
		{   count++;
		
		    if(count%3==0)
		    {
		      output=reverse(temp[i]); 
		    }
		    else
		    {
		        output=temp[i];
		    }
		    
            if (i == temp.length - 1)             // code from line 32 to 35 
                result = output + result;         // is string reversal code.
            else
                result = " " + output + result;
        }
        return result;
    }
    
    static String reverse(String str)
    {
        char [] a=str.toCharArray();
        int begin=0;
        int end=a.length-1;
        
        char temp ;
        while(begin<end)
		{
			temp=a[begin];
			a[begin]=a[end];
			a[end]=temp;
			begin++;
			end--;
		}
      return   String.valueOf(a);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String s= "this is my first java training class in gojek";
		
		
		
		System.out.println(reverseString(s));
		
		
		
		
	}
}
