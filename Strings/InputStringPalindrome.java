/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// To check if input String is Palindrome
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean checkPalindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        
        s=s.toLowerCase();
        
        while(start<=end)
        {
            char chstart=s.charAt(start);
            char chend=s.charAt(end);
            
            if(!(chstart>='a' && chstart <='z'))
            {
                start++;
            }
            else if(!(chend >='a' && chend <='z'))
            {
                end--;
            }
            else if(chstart==chend)
            {
                start++;
                end--;
            }
            else
            return false;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="A man, a plan, a canal: Panama";
		if(checkPalindrome(s))
		{
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not a Palindrome");
		}
	}
}
