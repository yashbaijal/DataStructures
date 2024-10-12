/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Maximum SubArraySum /Kadane's Algorithim
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int solution(int [] arr)
    {
        int currSum=arr[0];
        int total=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(currSum>=0)
            {
                currSum+=arr[i];
            }
            else{
                currSum=arr[i];
            }
            
            if(currSum>total)
            {
                total=currSum;
            }
        }
        
        return total;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={4,3,-2,6,7,-10,-10,4,5,9,-3,4,7,-28,2,9,3,2,11};
		System.out.println(solution(arr));
	}
}

==============================================
class GfG {

    // Function to find the maximum subarray sum
    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            // Find the maximum sum ending at index i by either extending 
            // the maximum sum subarray ending at index i - 1 or by
            // starting a new subarray from index i
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
          
            // Update res if maximum subarray sum ending at index i > res
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}

	
