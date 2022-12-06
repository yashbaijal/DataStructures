/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 Search for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Every row and column of the matrix is sorted in increasing order

*/
// TC=O(n)  TC=O(1)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean search(int [][] mat,int target )
    {
        if(mat.length==0) return false;
        
        int row=mat.length;
        int col=mat[0].length;
        
        int i=0,j=col-1;
        
        while(i<row && j>=0)
        {
            if(mat[i][j]==target)
            {
                System.out.println("target found at "+i+" "+j);
                return true;
            }
            
            if(mat[i][j]>target)
            {
                j--;
            }
            else{
                i++;
            }
        }
        return  false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		 int mat[][] = { { 10, 20, 30, 40,51 },
                        { 15, 25, 35, 45 ,55},
                        { 27, 29, 37, 48 ,58},
                        { 32, 33, 39, 50 ,60} };
                        
       System.out.println(search(mat,29));                    
	}
}
