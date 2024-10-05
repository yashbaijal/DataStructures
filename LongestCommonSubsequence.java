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
===================================================
	
import java.util.*;

class TUF {
    // Function to find the length of the Longest Common Subsequence (LCS)
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store results of subproblems
        int dp[][] = new int[n + 1][m + 1];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        // Initialize the first row and first column with zeros since LCS with an empty string is zero
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        // Fill the dp array using dynamic programming
        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                // If the characters at the current indices are the same, increment the LCS length
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                // If the characters are different, choose the maximum LCS length by either
                // excluding a character in s1 or excluding a character in s2
                else
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }

        return dp[n][m]; // Return the length of the Longest Common Subsequence (LCS)
    }

    public static void main(String args[]) {
        String s1 = "acd";
        String s2 = "ced";

        // Call the lcs function and print the result
        System.out.println("The Length of Longest Common Subsequence is " + lcs(s1, s2));
    }
}


