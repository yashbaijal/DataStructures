/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public.*/ TC=O(n), SC=O(n)
class Codechef
{
    public static List<List<Integer>> pascal(int n)
    {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> first_row=new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        for(int i=1;i<n;i++)
        {
            List<Integer> prev_row=triangle.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            
            for(int j=1;j<i;j++)
            {
                row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	   if(tester(5,3,2)==3)
	   {
	       System.out.println("Pass");
	   }
	   else
	   {
	       System.out.println("Fail");
	   }
	}
	
     public static int tester(int n,int list,int index)
     {
      List<List<Integer>> output=pascal(n);
	  int pascalvalue=output.get(list).get(index);
	     return pascalvalue;
     }
}
/* 
1
1 1
1 2 1
1 3 3 1
1 4 6 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 29 56 70 56 29 8 1
*/
