/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Q16. */
class Codechef
{
    public static int testcases(int [] a, int startindex)
    {
        Map<Integer,Integer> map=new HashMap<>();
        int count=1;
        int index=startindex;
        
        while(!map.containsKey(index))
        {
            if(a[index]>a.length) return -1;
            
            map.put(index,count);
            count++;
           
            index=a[index];
           
        }
        return count-map.get(index);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean testsPassed = true;
  
  testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
  testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;
  testsPassed &= countLengthOfCycle(new int[]{1, 3, 0,4,1}, 1) == 3;
  testsPassed &= countLengthOfCycle(new int[]{6, 3, 0,4,1}, 0) == -1;
  
  
  
  
  if(testsPassed) {
    System.out.println( "Test passed." );
    //return true;
  } else {
    System.out.println( "Test failed." );
    //return false;
  }
	}
}
