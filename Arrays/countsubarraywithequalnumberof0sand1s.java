/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// count subarray with equal number of 0s and 1s
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void solution(int [] arr)
    {
        int ans=0;
        HashMap<Integer,Integer> fmap=new HashMap<>();
        fmap.put(0,1);
        int sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                sum+=-1;
            }
            else if(arr[i]==1)
            {
                sum+=1;
            }
            
            if(fmap.containsKey(sum))
            {
                ans+=fmap.get(sum);
                fmap.put(sum,fmap.get(sum)+1);
            }
            else{
                fmap.put(sum,i);
            }
        }
        
        System.out.println("lsubarray with equal number of 0s and 1s  :"+ans);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		solution(arr);
	}
}
