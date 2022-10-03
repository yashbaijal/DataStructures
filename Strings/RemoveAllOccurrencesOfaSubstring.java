/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Remove All Occurrences of a Substring
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String removeOccurences(String input,String part)
    {
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<input.length();i++)
        {
            ans.append(input.charAt(i));
            if(ans.length()>=part.length())
            {
                if(ans.substring(ans.length()-part.length()).equals(part))
                {
                    ans.setLength(ans.length()-part.length());
                }
            }
        }
        return ans.toString();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String input="daabcbaabcbc";
		String part="abc";
		
		String output=removeOccurences(input,part);
		
		System.out.println(output);
	}
}
