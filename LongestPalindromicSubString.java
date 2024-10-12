// Time= O(n^2) Space=O(1)
//here we take j=1 to handle both even and odd length of palindrome string
//as since we expanding after plaindrome is found , like
// 1. if single character is palindrome then we expand low and hi
//to check if it's adjacent characters are also same and so, thus serving odd length strings.
//
// 2. if to adjacent characters match like in example string s==s so we now expand to each of
//characters adjacent characters,to check eqality and palindrome , thus serving  even length substrings.
public class Assignment {
    static String longestPalSubstr(String s)
    {
        int n=s.length();
        int start=0,maxlen=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=1;j++)
            {
                int low=i;
                int hi=i+j;

                while(low>=0 && hi<n &&s.charAt(low)==s.charAt(hi))
                {
                    int currlen=hi-low+1;
                    if(currlen>maxlen)
                    {
                        maxlen=currlen;
                        start=low;
                    }
                    low--;
                    hi++;
                }
            }
        }
        return s.substring(start,start+maxlen);
    }

        public static void main(String args[]) {
            String s = "forgeeksskeegfor";
            System.out.println(longestPalSubstr(s));

    }
}
=================================================================================

import java.util.*;
import java.lang.*;
import java.io.*;
// longestPalindromic substring TC=O(n^2)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void longestPalindrome(String input)
    {
        int n=input.length();
        
        if(n<2)
        {
            return;
        }
        
        int maxlength=1,start=0;
        int low=0,high=0;
        
        for(int i=0;i<n;i++)
        {
            low=i-1;
            high=i+1;
            
            while(high<n && input.charAt(i)==input.charAt(high))
            high++;
            
             while(low>=0 && input.charAt(i)==input.charAt(low))
            low++;
            
             while(low>=0 && high<n && input.charAt(low)==input.charAt(high)){
                low--;
                high++;
             }
             int len=high-low-1;
             if(len>maxlength)
             {
                maxlength= len;
                start=low+1;
             }
             
        }
        
        System.out.print("longest palindromic substring ");
        System.out.print(input.substring(start,start+maxlength)+" of length"+maxlength);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="forgeeksskeegfor";
		longestPalindrome(s);
	}
}
