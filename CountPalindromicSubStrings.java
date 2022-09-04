/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Print Or count palindromic substrings TC=O(n^2)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abccbc";
		
		ArrayList<String> res=new ArrayList<>();
		boolean [][] dp=new boolean[s.length()][s.length()];
		int count =0;
		
		for(int g=0;g<s.length();g++)
		{
		    for(int i=0,j=g;j<dp.length;i++,j++)
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
		          res.add(s.substring(i,j+1));
		         // count++;
		        }
		        
		    }
		}
		System.out.println(res);
	}
}
