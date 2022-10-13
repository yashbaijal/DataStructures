 /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
    private static Integer minimalsteps(String s)
    {
        int n=s.length();
        if(n==0)
        {
            return 0;
        }
        
        StringBuilder magicpotion =new StringBuilder();
        magicpotion.append(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(i*2<=n)
            {
                String compare=s.substring(0,i);
                if(compare.equals(s.substring(i,2*i)))
                {
                    magicpotion.append("*");
                    i=2*i-1;
                }
                else
                {
                    magicpotion.append(s.charAt(i));
                }
                
            }
            else
            {
                magicpotion.append(s.charAt(i));
            }
            
           
        }
        System.out.println(magicpotion.toString());
        return magicpotion.length();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		if (minimalSteps("ABCDABCE") == 8 && minimalSteps("ABCABCE") == 5 && minimalSteps("AAA") == 3
				&& minimalSteps("AAAA") == 3 && minimalSteps("BBB") == 3 && minimalSteps("AAAAAA") == 5) && minimalSteps("ABCABCDE") == 8 
				&& minimalSteps("") == 0  {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
