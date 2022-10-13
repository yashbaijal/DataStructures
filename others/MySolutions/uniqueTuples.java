/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static HashSet<String> uniquetuples(String s, int len)
    {
        HashSet<String> result=new HashSet<>();
        int length=0;
        
        if(s==null)
        {
            throw new IllegalArgumentException("String cannot br null");
        }
        else
        {
       length=s.length();
        }
         if(length==0)
         {
             throw new IllegalArgumentException("String cof length 0 is not allowed");
         }
         
         if (len<0)
         {
             throw new IllegalArgumentException("length of tuple cannot be less than zero");
         }
         
         if(len>length)
         {
            throw new IllegalArgumentException("length of tuple cannot be greater than length of string"); 
         }
        for(int i=0;i<(length-len+1);i++)
        {
            result.add(s.substring(i,(i+len)));
        }
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
       String input = "aab";
		String input1 = "abbccde";

		HashSet<String> result = uniqueTuples(input, 2);
		HashSet<String> result1 = uniqueTuples(input1, 2);
		
		if ((result.contains("aa") && result.contains("ab"))
				&& (result1.containsAll(Arrays.asList("ab", "bb", "bc", "cc", "cd", "de")) && result1.size() == 6)) {
			System.out.println("Test passed.");
		} else {
			System.out.println("Test failed.");
		}

       
	}
}
