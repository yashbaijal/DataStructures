/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Decimal to any base

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int getValue(int n , int b)
    {
        int rv=0;
        int p=1;
        while(n>0)
        {
            int dig=n%b;
            n=n/b;
            rv+=dig*p;
            p=p*10;
        }
        return rv;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=634;
		int base=8;
		
		int value=getValue(n,base);
		System.out.println(value);
	}
}
