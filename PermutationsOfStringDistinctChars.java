/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Permutaions of String When characters are distinct
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void permutations(String input,String ans)
    {
        if(input.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            String qlpart=input.substring(0,i);
            String qrpart=input.substring(i+1);
            String rest=qlpart+qrpart;
            permutations(rest,ans+ch);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abc";
		permutations(s,"");
	}
}
