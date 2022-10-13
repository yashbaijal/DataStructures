/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{  
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a = { 0 };
		int[] b = { 0, 1 };
		int[] c=  {3,4,5,6,1,2};

		boolean result = true;
		result &= FindMin(a) == 0;
		result &= FindMin(b) == 1;
		result &= FindMin(c) == 2;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			
			
		}
	}
	
	 public static int FindMin(int [] a)
    {
        if(a.length<2)
        {
            return 0;
        }

         int min1 =Integer.MAX_VALUE;
         int min2 =Integer.MAX_VALUE;
       
        for(int i=0;i<a.length;i++)
        {    
            int ele=a[i];
            if(ele<min1)
            {
                min2=min1;
                min1=ele;
            }
            else if(ele<min2)
            {
                min2=ele;
            }
        }
        return min2;
    }
}
