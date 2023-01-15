/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Next Permutataion in array TC=O(n)  SC=O(1)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void nextPermutation(int [] arr)
    {
        if(arr.length<=1 || arr==null) return;
        
        int index1=arr.length-2;//because next greater number always start from second last place
        
        while(index1>=0 && arr[index1]>=arr[index1+1]) index1--;
        
        if(index1>=0)
        {
            int index2=arr.length-1;
            while(arr[index2]<=arr[index1]) index2--;
            swap(arr ,index1,index2);
        }
        reverse(arr,index1+1,arr.length-1);
    }
    public static void swap(int [] arr , int i , int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr [], int i, int j)
    {
        while(i<j) swap(arr,i++,j--);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		 int [] arr= {1,3,5,4,2};
		 
		 nextPermutation(arr);
		 
		 for(int i=0;i<arr.length;i++)
		 {
		     System.out.print(arr[i]+" ");
		 }
		
		// if questions asked next greater number with same set of digits use below code 
		/*{
		int num=543976;
		int len=Integer.toString(num).length();
		
		int [] arr =new int[len];
		
		int res=0,rem=0;
		
		for(int i=arr.length-1;i>=0;i--)
		{
		    res=num%10;
		    num=num/10;
		    arr[i]=res;
		}
		nextPermutation(arr);
		*/
		
	}
	}
}
