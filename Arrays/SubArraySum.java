class Codechef
{
    public static void subarraySum(int[] arr,int sum)
	{
	       int l=0;
	       int n=arr.length;
	       int curr_sum=arr[0];
	       
	       for(int i=1;i<n;i++)
	       {
	              curr_sum=curr_sum+arr[i];
	              while(curr_sum>sum && l<i)
	              {
	                     curr_sum=curr_sum-arr[l];
	                     l++;
	              }
	              
	              if(curr_sum==sum)
	              {
	                     System.out.println(l+" "+i);
	                     return;
	              }
	              
	       }
	       System.out.println("No subarray");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int sum=23;
		subArraySum(arr,sum);
	}
}
==============================================================================
for -ve elements:
class Codechef
{
	//Same program can be used to find Subarray with sum zero.
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//subarray sum equal to k
		int[] arr={10, 2, -2, -20, 10};
		int sum=-10;
		
		subarraySum(arr,sum);
		
	}
	
	public static void subarraySum(int[] arr,int sum)
	{
	     HashMap<Integer, Integer>map=new HashMap<>();
	     int curr_sum=0;
	     for(int i=0;i<arr.length;i++)
	     {
	            curr_sum=curr_sum+arr[i];
	            
	            if(curr_sum==sum)
	            {
	                   System.out.println("Sub array found at indexs: "+0 +" "+i);
	                   return;
	            }
	            if(map.containsKey(curr_sum-sum))
	            {
	                   System.out.println("Sub array found at indexs: "+(map.get(curr_sum-sum)+1)+" "+i);
	                   return;
	            }
	            map.put(curr_sum,i);
	     }
	     
	    System.out.println("No subarray found with given sum");
	}
}
