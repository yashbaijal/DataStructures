/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* 
Buy and sell stocks -II 
1. multiple buy and sell are allowed 
2. user can't buy again before selling previously purchased stock ie same transation are not allowed 
    one after other.
3. item can be sell on next day    
*/
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int solve(int index ,boolean isBuy , int [] arr)
    {
        if(index==arr.length)
          return 0;
          
          int profit=0;
          
          if(isBuy==true)
          {
             int buy= -arr[index]+solve(index+1,false,arr);
             int ignore= 0+solve(index+1,true,arr);
             profit=Math.max(buy,ignore);
          }
          else
          {
            int sell= arr[index]+solve(index+1,true,arr);
            int ignore=0+solve(index+1,false,arr);
             profit=Math.max(sell,ignore);
          }
          
          return profit;
    }
    public static int maxProfit(int [] arr)
    {
        return solve(0,true,arr);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int arr []={7,1,5,3,6,4};
	     int ans=maxProfit(arr);
	     System.out.println("max profit is : "+ans);
	}
}
