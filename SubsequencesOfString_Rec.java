/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Subsequences of  a String
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void subsequenses(String input,String output)
    {
        if(input.length()==0)
        {
            System.out.println(output);
            return;
        }
        
        char ch=input.charAt(0);
        String rest=input.substring(1);
        
        subsequenses(rest,output+""+ch);
        subsequenses(rest,output+"");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abc";
		subsequenses(s,"");
	}
}
