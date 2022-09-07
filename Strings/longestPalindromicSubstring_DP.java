/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// longest Palindromic Substring
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="acbccbc";
		
		boolean [][] dp=new boolean [s.length()][s.length()];
		int len=0;
		for(int g=0;g<s.length();g++)
		{
		    for(int i=0,j=g;j<s.length();i++,j++)
		    {
		        if(g==0)
		        {
		            dp[i][j]=true;
		        }
		        else if(g==1)
		        {
		            if(s.charAt(i)==s.charAt(j))
		            {
		                 dp[i][j]=true;
		            }
		            else{
		                dp[i][j]=false;
		            }
		        }
		        else{
		            if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true)
		            {
		                dp[i][j]=true;
		            }
		            else{
		                dp[i][j]=false;
		            }
		        }
		        
		        if(dp[i][j])
		    {
		        len=g+1;
		    }
		    }
		}
		System.out.println(len);
	}
}
