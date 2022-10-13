/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Subarray sum equal to K 
/* Name of the class has to be "Main" only if the class is public. */
class Code
{
 
 public static void main(String [] args)

{
    int [] arr={1,4,20,3,10,5};
    int sum=33;
    subarray2(arr,sum);

}

public static void subarray(int arr [] , int sum)
{
   int currentsum=0;
   int start=0;
   int end=-1;
   
HashMap<Integer,Integer> map = new HashMap();

for(int i=0;i<arr.length;i++)
{
  currentsum+=arr[i];

  if(currentsum==sum)
  {
    start=0;
    end=i;
   break;

  }
    if(map.containsKey(currentsum-sum))
{
   start=map.get(currentsum-sum)+1;
   end=i;
   break;
}
  map.put(currentsum,i);

}  
   if(end==-1)
{
  System.out.println("No subarray present having sum ");
}
else
{
  System.out.println("Subarray present having given sum from " +start+" to " +end);
}


}
//<===================================================================================================>

 public static void subarray2(int arr [],int sum) // this approach only handles array with non negative numbers only.
 {
     int n=arr.length;
     int l=0;
     int currentsum=arr[0];
     
     for(int i=1;i<n;i++)
     {
         currentsum+=arr[i];
         
         while(currentsum>sum && l<i)
         {
             currentsum=currentsum-arr[l];
             l++;
         }
         
         if(currentsum==sum)
         {
             System.out.println("Subarray present having given sum from " +l+" to " +i);
             
         }
     }
     System.out.println("No subarray present having given sum "); 
     
 }

}
