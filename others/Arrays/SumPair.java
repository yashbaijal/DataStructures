/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// TC =O(n) , SC=O(n)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void sumpair(int arr [] , int sum)
    {
        HashSet<Integer> s=new HashSet<>();
         
        for(int i=0; i<arr.length;i++)
        {
            int temp= sum-arr[i];
            if(s.contains(temp))
            {  
               System.out.println("The two elements of array  equal to sum are :"+" ( "+arr[i]+" , "+temp+" )");
               
            }
            
            s.add(arr[i]);    
        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
int A[] = { 1, 4, 45, 6, 10, 8 ,12};
        int n = 16;
        sumpair(A, n);
	}
}
