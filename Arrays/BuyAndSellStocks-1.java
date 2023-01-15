/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* 
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int maxProfit(int [] arr)
    {
        int min=arr[0];
        int profit=0;
        
        for(int i=0;i<arr.length;i++)
        {
            int  diff=arr[i]-min;
            profit=Math.max(profit,diff);
            min=Math.min(min,arr[i]);
        }
        
        return profit;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int arr []={7,1,5,3,6,4};
	     int ans=maxProfit(arr);
	     System.out.println("max profit is : "+ans);
	}
}
