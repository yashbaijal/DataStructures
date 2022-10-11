/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Reverse words of string
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String reverse(String str)
    {
        String [] arr=str.split(" ");
        String res=" ";
        String output=" ";
        
        for(int i=arr.length-1;i>=0;i--)
        {
                  res=arr[i];
             output=output+" "+res;
           
        }
        return output;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String str="this is my first java programme";
		
	   System.out.println(reverse(str));
	}
}
