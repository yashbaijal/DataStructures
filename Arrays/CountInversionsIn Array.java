/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


//Count Inversions in An array using merge Sort
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int mergeAndCount(int arr [] ,int s, int m, int e)
    {
        int inv_count=0;
        int mid=(s+e)/2;
        
        int len1=mid-s+1;
        int len2=e-mid;
        
        int [] arr1=new int[len1];
        int [] arr2=new int[len2];
        
        int inputArrIdx=s;
        
        for(int i=0;i<len1;i++)
        {
            arr1[i]=arr[inputArrIdx++];
        }
        
        for(int i=0;i<len2;i++)
        {
            arr2[i]=arr[inputArrIdx++];
        }
        
        inputArrIdx=s;
        
        int idx1=0,idx2=0;
        
        while(idx1<len1 && idx2<len2)
        {
            if(arr1[idx1]<arr2[idx2])
            {
                arr[inputArrIdx++]=arr1[idx1++];
            }
            else{
                arr[inputArrIdx++]=arr2[idx2++];
                inv_count+=(m+1)-(s+idx1);
                //inv_count=inv_count+(mid-idx1);// so we are counting elements of left aray as 
                                               // they are greater than current element of right array  
                                               //
            }
        }
        
        while(idx1<len1)
        {
            arr[inputArrIdx++]=arr1[idx1++];
        }
        
        while(idx2<len2)
        {
            arr[inputArrIdx++]=arr2[idx2++];
        }
        
        return inv_count;
    }
    public static int mergeSortAndCount(int arr [] ,int s, int e)
    {
        int count=0;
        if(e>s)
        {
           int mid=(s+e)/2;
        
          count+=mergeSortAndCount(arr, 0,mid); 
          count+=mergeSortAndCount(arr,mid+1,e);
          count+=mergeAndCount(arr, s, mid ,e);
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr={8, 4, 2, 1};
		int n=arr.length;
		
		System.out.println(mergeSortAndCount(arr,0,n-1));
	}
}
?
/*
To Count inversions Merge SOrt concept is used , anytime an element
is picked from right array (mid+1 to end) while sorting a smaller number
appears on higher index , and large number is on lower index hence we
calculate with how many elements on left array(0 to mid) starting from current element
current right array element makes an inversion by using:
inv_count=(mid+1)-(start+indx1)
where idx1 is pointer used to traverse left array. 
 */