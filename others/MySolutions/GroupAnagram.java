/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void groupAnagram(String input)
    {
        String [] str=input.split(" ");
        Map<String,List<String>> m=new HashMap<>();
        for(String s:str)
        {
            char [] arr=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
        
        if(m.containsKey(sorted))
        {
            m.get(sorted).add(s);
        }
        else
        {
            List<String> l=new ArrayList<>();
            l.add(s);
            m.put(sorted,l);
        }
        
        }
        
        for(String c:m.keySet())
        {
            List<String> values =m.get(c);
            System.out.println(values);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String input = "cat dog tac sat tas god dog";
		groupAnagram(input);
	}
}
