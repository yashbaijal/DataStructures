/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static final String _document;
    
    static{
StringBuffer sb = new StringBuffer();
    sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
    sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
    sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

    _document = sb.toString();
  }
	public static void main (String[] args) throws java.lang.Exception
	{
	    if (pass()) {
      System.out.println("Pass");
    } else {
      System.out.println("Some Fail");
    }
	}
	
	static double shortestDistance(String document , String word1 , String word2)
	{
	    String [] words=document.split("[,. ]");
	    
	    int index=0;
	    double word1loc=0;
	    double word2loc=0;
	    
	    double shortest=document.length();
	    
	    for(String word:words)
	    {
	        if(word.equalsIgnoreCase(word1))
	        {
	            word1loc=index+(word1.length())/2d;
	        }
	        else if(word.equalsIgnoreCase(word2))
	        {
	            word2loc=index+(word2.length())/2d;
	        }
	        
	        if(word1loc>0 && word2loc>0)
	    {
	        double current=Math.abs(word1loc-word2loc);
	        if(current<shortest)
	         {
	           shortest=current;
	         }
	    }
	        
	        index+=word.length()+1; // 1 has been added to count special characters like " " , " ," ,"."
	    
	        //in index we are adding word length to keep track of occuring index of first character of specified word.
	    }
	    
	   
	    return shortest;
	}
	
	public static boolean pass() {
    return  shortestDistance(_document, "and", "graphic") == 6d &&
        shortestDistance(_document, "transfer", "it") == 14d &&
        shortestDistance(_document, "Design", "filler" ) == 25d ;
  }
}
