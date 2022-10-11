/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Print characters and their frequencies in order of occurrence
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void printCharWithFreq(String str)
    {
        int [] freq=new int[26];
        
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        
        for(int i=0;i<str.length();i++)
        {
            if(freq[str.charAt(i)-'a']!=0)
            {
            System.out.print(str.charAt(i));
            System.out.print(freq[str.charAt(i)-'a']+" ");
            }
            
            freq[str.charAt(i)-'a']=0;
        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "geeksforgeeks";
        printCharWithFreq(str);
	}
}
