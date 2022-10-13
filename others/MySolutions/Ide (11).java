/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
    public static int dotProduct(int [] arr1,int [] arr2)
    {
        int sum=0;
        
        if(arr1==null||arr2==null)
        {
            throw new IllegalArgumentException("Null array :: Invalid input");
        }
        
        for(int i=0;i<arr1.length;i++)
        {
            sum+=arr1[i]*arr2[i];
        }
        System.out.println( "Result of the dot product of array1 and array2 is : " + sum );
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	     int [] arr1=null;
	     int [] arr2={3,4};
	     int result=dotProduct(arr1,arr2);
	     System.out.println(result);
	}
}
