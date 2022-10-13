/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String rle(String s)
    {
       // char [] arr=s.toCharArray();
        StringBuilder sb = new StringBuilder();
       /* LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(arr[i]))
            {
                m.put(arr[i],m.get(arr[i])+1);
            }
            else
            {
                m.put(arr[i],1);
            }
        }
        
        for(Character c:m.keySet())
        {
            sb.append(c);
            sb.append(m.get(c));
        }*/
         int n=s.length();
         for(int i=0;i<n;i++)
         {
             int count=1;
             while(i<n-1 && s.charAt(i)==s.charAt(i+1))
             {
                 count++;
                 i++;
             }
            sb.append(s.charAt(i));
            sb.append(count);
         }
        return sb.toString();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		if("".equals(rle("")) && 
			  "a1".equals(rle("a")) && 
			  "a3".equals(rle("aaa")) && "a2b1".equals(rle("aab")) && "a7b5".equals(rle("aaaaabbbaabb")) )
			  {
		  System.out.println("Passed");
	  }
	  else 
	  {
		  System.out.println("Failed");
		
	}
	
}
}
