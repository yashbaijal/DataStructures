/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Length of the longest substring without repeating characters TC=O(n^2)
// here question is solved using sliding window technique
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int longestUniqueSubString(String str)
    {
        int res=0;
        
        boolean [] visited=new boolean[256];
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(visited[str.charAt(j)]==true)
                {
                    break;
                }
                else{
                    res=Math.max(res,j-i+1);
                    visited[str.charAt(j)]=true;
                }
            }
            visited[str.charAt(i)]=false;
        }
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "geeksforgeeks";
		System.out.println(longestUniqueSubString(str));
	}
}
================================================================
	
	public static void longestUniqueSubString(String str)
    {
        int res=0;
        int start=0,end=0;
        
        boolean [] visited=new boolean[256];
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(visited[str.charAt(j)]==true)
                {
                    break;
                }
                else{
                    if((j-i+1)>res)
                    {
                        start=i;
                        end=j;
                    }
                    res=Math.max(res,j-i+1);
                    visited[str.charAt(j)]=true;
                }
            }
            visited[str.charAt(i)]=false;
        }
        System.out.println(res);
        System.out.println("longestUniqueSubString : "+str.substring(start,end+1));
    }
