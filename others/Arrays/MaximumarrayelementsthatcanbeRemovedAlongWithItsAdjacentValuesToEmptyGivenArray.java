/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Maximum array elements that can be removed along with its adjacent values to empty given array.

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void printMap(int arr [] ,int n)
    {
    
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
        int countSteps=0;
        
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            int x=m.getKey();
            
            int value=map.get(x);
            
            
            if(value>0)
            {
                countSteps++;
                map.replace(x,0);
            
                if(map.containsKey(x+1))
                { 
                    if(map.get(x+1)!=0)
                     map.replace(x+1,0);
                }
            }
            
        }
        
        System.out.println("Max Steps required are : "+countSteps);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr ={5,1,3,2,6,7,4};
		int n=arr.length;
		
		printMap(arr,n);
	}
}
