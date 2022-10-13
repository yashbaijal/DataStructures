/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   //static  int x=0, y=0;
 Integer [] result ={0,0};
    public static Integer[] walk(String s)
    { 
       
       Integer [] result ={0,0};
       char [] a= s.toCharArray();
       
       for(int i=0;i<a.length;i++)
        {
            char move=a[i];
            if(move=='R')
            {
                result[0]++;
            }
            else if(move=='L')
            {
                result[0]--;
            }
            else if(move=='U')
            {
                result[1]++;
            }
            else if(move=='D')
            {
                result[1]--;
            }
            else
            {
                continue;
            }
        }
        
        return result;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		if(doTestsPass()){
    System.out.println("All tests pass");
  } else {
    System.out.println("There are test failures");
  }
	}
	public static boolean checkEqual(Integer[] a, Integer[] b) {
  return Arrays.equals(a, b);
  }

  public static boolean doTestsPass() {
  boolean res = true;
  {
    String test = "";
    Integer[] result = walk(test);
    res &= checkEqual(result, new Integer[]{0, 0});
  }

  {
    String test = "L";
    Integer[] result = walk(test);
    res &= checkEqual(result, new Integer[]{-1, 0});
    System.out.println(result[0]+"---"+result[1]);
  }

  {
    String test = "UUU";
    Integer[] result = walk(test);
    res &= checkEqual(result, new Integer[]{0, 3});
     System.out.println(result[0]+"---"+result[1]);
  }

  {
    String test = "ULDR";
    Integer[] result = walk(test);
    res &= checkEqual(result, new Integer[]{0, 0});
     System.out.println(result[0]+"---"+result[1]);
  }

  {
    String test = "ULLLDUDUURLRLR";
    Integer[] result = walk(test);
    res &= checkEqual(result, new Integer[]{-2, 2});
     System.out.println(result[0]+"---"+result[1]);
  }

  {
    String test = "UP LEFT 2xDOWN DOWN RIGHT RIGHT UP UP";
    Integer[] result = walk(test);
    res &= checkEqual(result, new Integer[]{1, 1});
     System.out.println(result[0]+"---"+result[1]);
  }

  return res;
  }
}
