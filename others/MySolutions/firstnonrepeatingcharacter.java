/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String[] inputs = {"apple","racecars", "ababdc"};
    char[] outputs = {'a', 'e', 'd' };

    boolean result = true;
    for(int i = 0; i < inputs.length; i++ )
    {
      result = result && findFirst(inputs[i]) == outputs[i];
      if(!result)
        System.out.println("Test failed for: " + inputs[i]);
      else
        System.out.println("Test passed for: " + inputs[i]);
    }
	}
	public static char findFirst(String s)
  {
    char ch=' ';
		
		LinkedHashMap<Character,Integer> m= new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			
			if(m.containsKey(s.charAt(i)))
			{
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
			else
			{
				m.put(s.charAt(i), 1);
			}
		}
		for(Character c:m.keySet())
		{
			if(m.get(c)>1){
				continue;
			}
			else
			{
				ch =c;
				break;
			}
		}
    return ch;
  }
}
