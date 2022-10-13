/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String findTopIPAddress(String [] lines)
    {
        long max = Integer.MIN_VALUE;
	    HashMap<String,Integer> entry=new HashMap<>();
	    
	    for(String s:lines)
       {
           String [] extract=s.split("-");
           String ip=extract[0];
         
           if(entry.containsKey(ip))
           {
               entry.put(ip,entry.get(ip)+1);
           }
           else
           {
                entry.put(ip,1);
           }
       }
       
       StringBuilder sb=new StringBuilder();
       
       for(String value:entry.keySet())
       {
           if(entry.get(value)>=max)
           {
        	   max=entry.get(value);
               sb.append(value);
           }
       }
       
       return sb.toString();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String lines[] = new String[] {
			"10.0.0.1 - log entry 1 11",
	        "10.0.0.1 - log entry 2 213",
	        "10.0.0.2 - log entry 133132",
	        "10.0.0.2 - log entry 133132",
	        "10.0.0.3 - log entry 133132",
	        "10.0.0.3 - log entry 133132" };
	        
	        String result = findTopIPAddress(lines);
    
    if (result.equals("10.0.0.1 10.0.0.2 10.0.0.3 ")) {
      System.out.println("Test passed");
      
    } else {
      System.out.println("Test failed");
      
    }  
	}
}
