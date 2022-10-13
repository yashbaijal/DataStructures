/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// String Validation using Stack.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="{{}{}}{{}}";
		
		System.out.println(isValidInput(s)?"Input String is Valid":"Input String is invalid");
		
	}
	
	public static boolean isValidInput(String s)
	{
	    Stack<Character> m=new Stack<>();
	    
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        
	        if(ch=='{')
	        {
	            m.push(ch);
	        }
	        else if(ch=='}'&& m.peek()=='{')
	        {
	            m.pop();
	        }
	        else
	        {
	            return false;
	        }
	    }
	    
	    return m.isEmpty();
	}
}
