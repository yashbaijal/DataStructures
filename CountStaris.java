/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// count-ways-to-reach-nth-stairs 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int countWays(int n)
    {
        if(n<0)
        {
            return 0;
        }
        
        if(n==0)
        {
            return 1;
        }
        
        int ways=countWays(n-1)+countWays(n-2);
        
        return ways;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int stair=5;
		System.out.println("Number of ways to reach "+stair+"th stair are:"+countWays(stair));
	}
}
