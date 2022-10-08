/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Remove All Adjacent Duplicates In String
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static  String remove(String input)
    {
        char [] arr=new char[input.length()];
        
        int i=0;
        
        for(int j=0;j<input.length();j++)
        {
            char curr=input.charAt(j);
             if(i>0 && arr[i-1]== curr)
             {
                 i--;
             }
             else{
                arr[i]=curr;
                i+=1;
             }
        }
        return new String(arr,0,i);
    }
    public static void main (String[] args) throws java.lang.Exception
	{
	    String input="abbaca";
	    System.out.print(remove(input));
    }

}
