/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 Search for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

*/
// TC=O(log n*m)  TC=O(1)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean search(int [][] mat,int target )
    {
        if(mat.length==0) return false;
        
        int row=mat.length;
        int col=mat[0].length;
        
        int low=0;             // marking all cells of matrix as indexes to apply 
        int high=(row*col)-1;  // binary search on whole matrix assuming matrix to be an 1-D array
        
        while(low<=high)
        {
            int mid=(low+(high-low)/2);
            
            if(mat[mid/col][mid%col]==target)
            {
                return true;
            }
            
            if(mat[mid/col][mid%col]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int mat[][] = { { 1,3,5,7 },
                        { 10,11,16,20 },
                        { 23,30,34,60 }};
                        
       System.out.println(search(mat,3));                    
	}
}
