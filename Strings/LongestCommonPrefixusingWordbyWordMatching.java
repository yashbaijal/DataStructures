/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Longest Common Prefix using Word by Word Matching
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String longestCommonPrefix( String arr[])
    {
        String prefix=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            prefix=prefixUtil(prefix,arr[i]);
        }
        
        return prefix;
    }
    
    public static String prefixUtil(String s1,String s2)
    {
        String res="";
        int n1=s1.length();
        int n2=s2.length();
        
        for(int i=0,j=0;i<n1 && j<n2;i++,j++)
        {
            if(s1.charAt(i)!=s2.charAt(j))
            {
                break;
            }
            res+=s1.charAt(i);
        }
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		 String arr[] = {"geeksforgeeks", "geeks",
            "geek", "geezer"};
            
           System.out.println(longestCommonPrefix(arr));
	}
}
