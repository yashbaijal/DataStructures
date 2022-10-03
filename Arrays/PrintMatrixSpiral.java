/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Print 2D Array as Spiral TC=O(n*m)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public List<Integer> printSpiral(int [][] matrix)
    {
        List<Integer> ans=new ArrayList<>();
        
        int row=matrix.length;
        int col=matrix[0].length;
        
        int count=0;
        int total=row*col;
        
        int startingRow=0;
        int startingCol=0;
        int endingRow=row-1;
        int endingCol=col-1;
        
        while(count<total)
        {
            // print startingRowow
            for(int index=startingCol;count<total && index<=endingCol;index++)
            {
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;
            
            // print endingCol
            
            for(int index=startingRow ;count<total && index<=endingRow;index++)
            {
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;
            
            //print endingRow
            
            for(int index=endingCol;count<total && index>=startingCol;index--)
            {
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;
            
            //print startingCol
            
            for(int index=endingRow;count<total && index>=startingRow;index--)
            {
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return ans;
    }
}
