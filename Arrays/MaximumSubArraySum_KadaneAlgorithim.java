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
