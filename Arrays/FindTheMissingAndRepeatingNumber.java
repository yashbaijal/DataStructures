/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Find the missing and repeating number
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static  void find(int [] input)
    {
        int i=0;
        for(i=0;i<input.length;i++)
        {
            int value=Math.abs(input[i]);
            if(input[value-1]>0)
            {
                input[value-1]=-input[value-1];
            }
            else{
                System.out.println("repeating number is :"+value);
            }
        }
        
        for(i=0;i<input.length;i++)
        {
            if(input[i]>0)
            {
                System.out.println("Missing number is :"+(i+1));
            }
        }
    }
    
    public static void findNew(int [] input)
    {
        Map<Integer,Boolean> map=new HashMap<>();
        for(Integer i:input)
        {
          if(map.get(i)==null)
          {
              map.put(i,true);
          }
          else{
              System.out.println("repeating number is :"+i);
          }
        }
        
        for(int i=1;i<=input.length;i++)
        {
            if(map.get(i)==null)
            {
                System.out.println("Missing = " + i);
            }
        }
    }
    public static void main (String[] args) throws java.lang.Exception
	{
	    int [] input={4,3,2,6,1,1};
	    findNew(input);
    }

}
