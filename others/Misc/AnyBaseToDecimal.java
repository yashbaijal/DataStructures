/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// Any base to Decimal.
class Codechef
{
    public static int getvalue(int n , int b)
    {
        int res=0;
        int p=1;
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            res+=dig*p;
            p=p*b;
        }
        
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	   int n=1101;
	   int base =2;
	   
	   int value=getvalue(n, base);
	   System.out.println(value);
	}
}
