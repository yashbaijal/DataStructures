/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Length of the longest substring without repeating characters TC=O(n^2)
// here question is solved using sliding window technique
/* Name of the class has to be "Main" only if the class is public. */
class Codechef       ==> O(n) Time and O(1) Space
{
    public static void longsetSubstring(String s)
    {
        int left=0,right=0;
        int maxlen=0;
        boolean [] visited=new boolean[256];

        while(right<s.length())
        {
            while(visited[s.charAt(right)])
            {
                visited[s.charAt(right)]=false;
                left++;
            }
            visited[s.charAt(right)]=true;
            maxlen=Math.max(maxlen,(right-left+1));
            right++;
        }
        System.out.println("max length is : "+maxlen);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s= "geeksforgeeks";
		longsetSubstring(s);
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
==================================================================
	
	public static void longestUniqueSubString_2(String str) // TC=O(N) SC=O(N)
    {
        int start=0;
        int maxlen=Integer.MIN_VALUE;
        int low=0,high=0;
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int end=0;end<str.length();end++)
        {
            if(map.containsKey(str.charAt(end)))
            {
                start=Math.max(start,map.get(str.charAt(end))+1);
            }
            map.put(str.charAt(end),end);
            if((end-start+1)>maxlen)
            {
                low=start;
                high=end;
            }
            maxlen=Math.max(maxlen,end-start+1);
        }
        System.out.println("longestUniqueSubString : "+maxlen+" " +str.substring(low,high+1));
    }
=====================================================================
// TC of this approach O(n) cuz (Note: Even though we have nested for loops, start only goes from 0 to s.length() once
	public static void longestUniqueSubString(String s)
    {
        int start=0;
        int maxlen=Integer.MIN_VALUE;
        
        int [] count=new int[128];
        
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
            if(count[s.charAt(i)]>1)
            {
                while(count[s.charAt(i)]>1)
                {
                    count[s.charAt(start)]--;
                    start++;
                }
            }
            maxlen=Math.max(maxlen,(i-start+1));
        }
        System.out.println(maxlen);
    }
