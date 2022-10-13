/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr ={2,2,2,2,5,5,2,3,3};
		int candidate=getCandidate( arr);
		System.out.println(isMajority(arr, candidate)?" Majority Element "+candidate: "Majority Element not Present");
	}
	
	public static int getCandidate(int arr [] )
	{
	    int votee=arr[0];
	    int vote=1;
	    
	    for(int i=1;i<arr.length;i++)
	    {
	        if(arr[i]==votee)
	        vote++;
	        else
	        vote--;
	        
	        if(vote==0)
	        {
	            votee=arr[i];
	            vote=1;
	        }
	    }
	    return votee;
	}
	
	public static boolean isMajority(int arr [] , int majorityElement)
	{
	    int count=0;
	    int n=arr.length;
	    for(int i=0; i<n;i++)
	    {
	        if(arr[i]==majorityElement)
	        count++;
	    }
	    
	    if(count>n/2)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
}
