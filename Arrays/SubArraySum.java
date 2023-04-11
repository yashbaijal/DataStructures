class Codechef
{
    public static void subArraySum(int [] arr, int s)
    {
        int start=0;
        int arrSum=0;
        int end=0;
        int flag=0;
        
        for(int i=0;i<arr.length;i++)
        {
            
            while(arrSum>s && start<i-1)
            {
                arrSum=arrSum-arr[start];
                start++;
            }
            
            if(arrSum==s)
            {
                 end=i-1;
                 flag=1;
                 break;
            }
            
            if(i<arr.length)
            arrSum+=arr[i];
        }
        
        if(flag==1)
        {
            System.out.println("subarray exists between :"+start+"and"+end);
        }
        else{
             System.out.println("No subarray with given sum found");
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int sum=23;
		subArraySum(arr,sum);
	}
}
