class Codechef
{
    public static void secondLargest(int [] arr)
    {
        int n=arr.length;
        
        int first,second;
        first=second=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second)
            {
                second=arr[i];
            }
        }
        
        System.out.println("Second larget number"+second);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		secondLargest(arr);
	}
}
