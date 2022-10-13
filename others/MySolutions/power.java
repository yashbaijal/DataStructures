/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		if (testcases()){
      System.out.println("All Tests Pass");
		}
    else{
      System.out.println("There are test failures");
	}
	}
	
	static double  power(double base, int n)
	{  
	    double output=0.0;
	    if(n==0)
	    {
	        return 1;
	        
	    }
	    if(n<0)
	    {
	        n=n*-1;
	        output= base*power(base,n-1);
	        return 1/output;
	    }
	    else
	    {
	        output= base*power(base,n-1);
	        return output;
	    }
	}
	
	public static boolean testcases()
	{
	   double base[] = {2,2, 2.3, 0, 5.5,6.2};
    int exp[] ={4,-3,20, 10, 0,  1};
    boolean status = true;
    double correctness = 0.0001;
    
    for (int i=0;i<base.length;i++)
    {
        double actual=power(base[i],exp[i]);
        double expected=Math.pow(base[i],exp[i]);
        boolean result=Math.abs(actual-expected)<correctness;
        status=status && result;
    }
    return status;
	}
}
