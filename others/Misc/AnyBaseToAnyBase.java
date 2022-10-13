/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// Any Base to Any Base.
class Codechef
{
    public static int getValue(int n , int b1, int b2)
    {
        int num=baseToDecimal(n,b1);
        int output=decimalToBase(num,b2);
        
        return output;
    }
    
    public static int baseToDecimal(int n , int b)
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
    
    public static int decimalToBase(int n , int b)
    {
        int res=0;
        int p=1;
        
        while(n>0)
        {
            int dig=n%b;
            n=n/b;
            res+=dig*p;
            p=p*10;
        }
        
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=1101;
		
		int base1=2;
		int base2=8;
		
		int value=getValue(n,base1,base2);
		System.out.println(value);
	}
}
