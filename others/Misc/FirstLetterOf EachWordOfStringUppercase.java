/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s= "this is java class";
		
		String [] arr= s.split(" ");
		
		for(String st : arr)
		{   
		    int n=st.length();
		    
		    String s1=st.substring(0,1);
		    String input=s1.toUpperCase()+st.substring(1,n);  
		    System.out.print(input+" ");
		}
		
		
	}
}
