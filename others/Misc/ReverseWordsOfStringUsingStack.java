/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Reverse words in a string using Stack.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s ="This is Class";
		reverse(s);
		
	}
	

	public static void reverse(String s)
	{
	    String [] arr =s.split(" ");
	    
	    Stack<String> st=new Stack<>();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        st.push(arr[i]);
	    }
	    
	    while(!st.isEmpty())
	    {
	        System.out.print(st.peek()+" ");
	        st.pop();
	    }
	}
}
