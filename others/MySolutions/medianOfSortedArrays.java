/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Median of equal different length  sorted arrays Time Complexity: O(m + n). Space Complexity: O(1). */
class Codechef
{
    public static int test(int [] A, int [] B, int n,int m)
    {
        int k=0;
        int m1=-1, m2=-1;
        int i=0;
        int j=0;
        
        if ((m+n)%2==0)
        {
        for(k=0;k<=(m+n)/2;k++)
        { 
            m2=m1;
            if(i!=n && j!=m)
            {
                m1=(A[i]>B[j])?B[j++]:A[i++];
            }
            else if(i<n)
            {
                 m1=A[i++];
            }
            
            else
            {
                m1=B[j++];
            }
        }
        return (m1+m2)/2;
        }
        else
        {
            System.out.println("inside else");
            for(k=0;k<=(m+n)/2;k++)
        {
            if(i!=n && j!=m)
            {
               m1=(A[i]>B[j])?B[j++]:A[i++];
            }
            else if(i<n)
            {
                m1=A[i++];
            }
           
            else
            {
               m1=B[j++];
            }
        }
        return m1;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int ar1[] = {3,4};  
        int ar2[] = {5, 6,7,8};  
      
        int n1 = ar1.length;
        int n2 = ar2.length;
        
            System.out.println("Median is " +
                        test(ar1, ar2, n1,n2));
       
	}
}
