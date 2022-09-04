/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Longest commonSubsequence 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1="abcd";
		String s2="aebd";
		
		int [][] dp=new int[s1.length()+1][s2.length()+1];
		
		for(int i=dp.length-2;i>=0;i--)
		{
		    for(int j=dp[0].length-2;j>=0;j--)
		    {
		        if(s1.charAt(i)==s2.charAt(j)) // since both characters are same so common character  
		        {                              // is to be added in subsequence of previous substring
		            dp[i][j]=1+dp[i+1][j+1];   // hence it is 1+length of previous subsequence
		        }
		        else{
		           dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]); 
		        }
		    }
		}
		System.out.println(dp[0][0]);
	}
}
