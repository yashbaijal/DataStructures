/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Number of subarrays having sum exactly equal to k
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void subarraySum(int [] arr,int sum)
    {
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0,1);// this value is added so that if currSum=sum then we have to increase value of total sub arraycount
        int currSum=0;
        int totalSub=0;
        
        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            
            int res=currSum-sum; // calculating value to be removed from current sum so that it will become equal to desired sum
            if(prevSum.containsKey(res))
            {
                totalSub+=prevSum.get(res);
            }
            
            prevSum.put(currSum,prevSum.getOrDefault(currSum,0)+1);
        }
        
        System.out.println(totalSub);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={10, 2, -2, -20, 10};
		int sum=-10;// desired sum
		
		subarraySum(arr,sum);
	}
}
