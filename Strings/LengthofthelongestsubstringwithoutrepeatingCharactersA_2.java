/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Length of the longest substring without repeating characters Approach-2  TC=O(n)
// here question is solved using sliding window technique,but here we are removing 
// previously visited string , and computing again.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int longestUniqueSubString(String str)
    {
        int res=0;
        
        String temp="";
        
        for(char c:str.toCharArray())
        {
            String curr=String.valueOf(c);
            
            if(temp.contains(curr))
            {
                temp=temp.substring(temp.indexOf(curr)+1);
            }
            temp=temp+curr;
            res=Math.max(temp.length(),res);
        }
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "geeksforgeeks";
		System.out.println(longestUniqueSubString(str));
	}
}
