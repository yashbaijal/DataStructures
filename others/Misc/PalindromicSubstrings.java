/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Print All Palindrome substrings of a String.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        
        while(i<=j)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            
            if(ch1 != ch2)
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        
        return true;
    }
    
    public static void solution(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String sub=s.substring(i,j);
                if(isPalindrome(sub)==true)
                {
                    System.out.println(sub);
                }
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abaab";
		solution(s);
	}
}
