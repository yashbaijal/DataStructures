/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//two non-overlapping pairs having the same sum in an array
/* Name of the class has to be "Main" only if the class is public. */
class Pair 
{
    public int x,y;
    
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Codechef
{
    public static void findPairs(int [] arr)
    {
        HashMap<Integer,List<Pair>> map=new HashMap<>();
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                
                if(map.containsKey(sum))
                {
                    for(Pair pair:map.get(sum))
                    {
                        int m=pair.x;
                        int n=pair.y;
                        
                        if((m!=i && m!=j) && (n!=i && m!=j))
                        {
                            System.out.println("first pair"+arr[i]+" "+arr[j]);
                            System.out.println("Second pair"+arr[m]+" "+arr[n]);
                            
                             return;
                        }
                    }
                }
                map.putIfAbsent(sum,new ArrayList<>());
                map.get(sum).add( new Pair(i,j));
            }
        }
         System.out.println("No non-overlapping pairs present");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = { 2,9,3,5,8,6,4 };
 
        findPairs(nums);
	}
}
