/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Power of Ten */
class Codechef
{
    public static boolean isPowerOf10(int x)
    {
        if(x%10!=0 ||x==0)
        {
            return false;
        }
        
        if (x==10)
        {
            return true;
        }
        
        return isPowerOf10(x/10);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		 doTestsPass();
     }

public static boolean doTestsPass()
  {
  int[] isPowerList = { 10, 100, 10000, 1000000000};
  int[] isNotPowerList = {1,3, 50, 0, -1, -10, -50, -53, 2000000000};

  for(int i : isPowerList)
  {
    if(!isPowerOf10(i))
    {
    System.out.println("Test failed for: " + i);
    return false;
    }
  }

  for(int i : isNotPowerList)
  {
    if(isPowerOf10(i))
    {
    System.out.println("Test failed for: " + i);
    return false;
    }
  }

  System.out.println("All testcases  passed");
  return true;
  }
}
