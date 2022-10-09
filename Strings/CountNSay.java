/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Count and Say 
// 1,11,21,1211,111221....
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String countNSay(int n)
    {
       if(n==1) return "1";
       if(n==2) return "11";
       
       String output="11";
       
       for(int i=3;i<=n;i++)
       {
           output+="$";// appending a dummy character so that our loop will run one more time 
                       // when string ends ,if not then we will get ArrayIndexOutOfBoundsException
                       // as no more element will be present in char array(line 24) to process .
           int count=1;
           char [] arr=output.toCharArray();
           int len=output.length();
           String temp="";
           
           for(int j=1;j<len;j++)
           {
               if(arr[j]!=arr[j-1])
               {
                   temp+=count;
                   temp+=arr[j-1];
                   count=1;
               }
               else{
                   count++;
               }
           }
           output=temp;
       }
       return output;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n=5;
		System.out.println(countNSay(n));
	}
}
