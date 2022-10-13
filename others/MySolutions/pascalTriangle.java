/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
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
		System.out.println(pascal(5));
	}
}
