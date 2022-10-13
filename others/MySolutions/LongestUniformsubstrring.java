/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();
    
    public static int[] longestUniformSubstring(String a)
    {
        int longeststart=-1;
        int longestlength=0;
        int currentstart=0,currentlength=0;
        int length=a.length();
        char prevChar=' ';
        
        
        
        for(int i=0;i<length;i++)
        {
            if(a.charAt(i) != prevChar)
            {
                prevChar = a.charAt(i);
                currentstart=i;
                currentlength=1;
            }
            else
            {
                currentlength++;
            }
            
            if(currentlength>longestlength)
            {
                longeststart=currentstart;
                longestlength=currentlength;
            }
        }
        
        return new int[]{ longeststart, longestlength };
        
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		 testCases.put("", new int[]{-1, 0});
    testCases.put("10000111", new int[]{1, 4});
    testCases.put("aabbbbbCdAA", new int[]{2, 5});

    boolean pass = true;
    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
      int[] result = longestUniformSubstring(testCase.getKey());
      pass = pass && (Arrays.equals(result, testCase.getValue()));
    }
    if(pass){
      System.out.println("All tests pass!");
    } else {
      System.out.println("At least one failure! :( ");
    }
	}
}
