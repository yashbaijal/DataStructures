/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{    
    private final static String alphabet="abcdefghijklmnopqrstuvwxyz";
	public static void main (String[] args) throws java.lang.Exception
	{
	//	String s="The quick brown fox ";
	//	String missing=findmissing(s);
	//	System.out.println("Missing numbers are :"+missing);
	
	testcases();
		
	}
	
	public static String findmissing(String s)
	{
	   HashSet<Character> m=new HashSet<Character>();
	   
	   for(int i=0;i<alphabet.length();i++)
	   {
	       m.add(alphabet.charAt(i));
	   }
	   
	   String str=s.toLowerCase();
	   
	   for(int i=0;i<str.length();i++)
	   {
	       m.remove(str.charAt(i));
	   }
	   
	   StringBuilder sb = new StringBuilder();
	   
	   for(Character c:m)
	   {
	       sb.append(c);
	   }
	   
	   return sb.toString();
	}
	
	public static void testcases()
	{
	  boolean success=true;
	  
	 // success = success && "".equals(findmissing("The quick brown fox jumps over the lazy dog"));
      success = success && alphabet.equals(findmissing(""));
	  success = success && "defghijklmnopqrstuvw".equals(findmissing("abcxyz"));
      
      if(success)
      {
          System.out.println("Pass");
      }
      else
      {
        System.out.println("Fail") ; 
      }
	}
}
