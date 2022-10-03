/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Rotate square matrix by 90 degrees
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void rotate(int [][] matrix,int size)
    {
       for(int i=0;i<size;i++)
       {
           reverse(i,matrix,size);
       }
       
       for(int i=0;i<size;i++)            // Inplace Tranpose of a Matrix
       {
           for(int j=i;j<size;j++)
           {
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
           }
       }
    }
    
    public static void reverse(int index,int [][] matrix,int size)
    {
        int start=0;
        int end=size-1;
        
        while(start<end)
        {
            int temp=matrix[index][start];
            matrix[index][start]=matrix[index][end];
            matrix[index][end]=temp;
            start++;
            end--;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int matrix [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int size=4;
		rotate(matrix,4);
		
		for (int i = 0; i < size; i++) {
            for ( int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }

}
