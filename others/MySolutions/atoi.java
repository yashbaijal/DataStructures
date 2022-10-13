/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*Q23 atoi. TimeCmplexity=O(n) space =O(1) */
class Codechef
{
    public static int atoi(String s)
    {
        int result =0;
        int i=0;
        int sign=1;
        int len=s.length();
        
        if(len!=0 && s.charAt(0)=='-')
        {
            sign=-1;
            i++;
        }
        
        for(;i<len;i++)
        {
            char c=s.charAt(i);
            
            if(c<'0'||c>'9')
            {
                continue;
            }
            
            result=result*10+c-'0';
        }
        return result*sign;
    }
	
	public static boolean doTestsPass()
  {
  boolean result = true;
  result = result && atoi("0") == 0;
  result = result && atoi("1") == 1;
  result = result && atoi("123") == 123;
  result = result && atoi("-1") == -1;
  result = result && atoi("-123") == -123;
  result = result && atoi("123a") == 123;
  result = result && atoi("1a12") == 112;
  result = result && atoi("ab") == 0;
  String intMax = String.valueOf(Integer.MAX_VALUE);
  result = result && atoi(intMax) == Integer.MAX_VALUE;

  String intMin = String.valueOf(Integer.MIN_VALUE);
  //System.out.println(intMin);
  result = result && atoi(intMin) == Integer.MIN_VALUE;

  return result;
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		if(doTestsPass())
    {
    System.out.println("All tests pass");
    }
    else
    {
    System.out.println("There are test failures");
    }
	}
}
