/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String revStr(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        return str;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	String testString;
    String solution;
    boolean result = true;

    result = result && revStr("abcd").equals("dcba");
  
  if(result){
    System.out.println("All tests pass");
  }
  else{
    System.out.println("There are test failures");
  }
	}
}
