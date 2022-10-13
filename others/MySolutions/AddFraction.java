/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int gcd(int a, int b)  
{  
    if (a == 0)  
        return b;  
    return gcd(b%a, a);  
} 

static int [] lowest(int num,int den)
{
   int commonfactor=gcd(num,den);
    
    num=num/commonfactor;
    den=den/commonfactor;
    
    return new int [] {num , den};
}

 static int [] findfraction(int [] fraction1,int [] fraction2)
 {
     int num1=fraction1[0];
     int num2=fraction2[0];
     int den1=fraction1[1];
     int den2=fraction2[1];
     
     
       try
	    {
	        
	    if(den1==0 || den2==0)
		throw new IllegalArgumentException("0 as denominator is not allowed");
	        
	    }
	    catch(Exception e)
	    {
	        return new int [] {0,-1};
	    }
		
     
      int den3=gcd(den1,den2);
     
     den3=(den1*den2)/den3;
    
    int num3=((num1)*(den3/den1)) + ((num2)*(den3/den2));

    return lowest(num3,den3);
 }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] result = findfraction(new int [] {1,500},new int [] {2,1500});
		int [] result1 = findfraction(new int [] {1,4},new int [] {6,12});
		int [] result2 = findfraction(new int [] {0,4},new int [] {6,12});
		int [] result3 = findfraction(new int [] {3,4},new int [] {6,0});
	    
	    if(result[0]==1 && result[1]==300 && result1[0]==3 && result1[1]==4 && 
		   result2[0]==1 && result2[1]==2 &&  result3[0]==1 && result3[1]==-1)
	    {
	        System.out.println("Pass");
	    }
	    else
	    {
	         System.out.println("Fail");
	    }
	}
}
