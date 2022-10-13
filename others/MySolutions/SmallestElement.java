/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
    public static int FindMin(int [] a)
    {
        int min =a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }
	public static void main (String[] args) throws java.lang.Exception
	{boolean result = true;
    result = result && FindMin(new int[]{3,4,5,6,1,2}) == 1;
    result = result && FindMin(new int[]{2,1}) == 1;
    result = result && FindMin(new int[]{1}) == 1;

    try {
      FindMin(null);
      result = false;
    }
    catch(Exception e)
    {
      result = result && true;
    }

    if(result)
    {
      System.out.println("All tests pass");
    }
    else
    {
      System.out.println("There are test failures");
    }
	}
}
