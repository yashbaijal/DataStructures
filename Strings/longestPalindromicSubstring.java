/* package codechef; // don't place package name! */

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
