TC= o(n) , SC=O(n)
class Codechef  
{
    static void sumpair(int arr [] , int sum)
    {
        HashSet<Integer> s=new HashSet<>();
         
        for(int i=0; i<arr.length;i++)
        {
            int temp= sum-arr[i];
            if(s.contains(temp))
            {  
               System.out.println("The two elements of array  equal to sum are :"+" ( "+arr[i]+" , "+temp+" )");
               
            }
            
            s.add(arr[i]);    
        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
int A[] = { 1, 4, 45, 6, 10, 8 ,12};
        int n = 16;
        sumpair(A, n);
	}
}
==================================================================================
   O(n*log(n))--time and O(1)--space

  public class Assignment {
    // for each number arr[i] in the array, we first calculate its complement
    // (i.e., target – current number) then uses binary search to quickly check if this complement
    // exists in the subarray after index i.
    public static   boolean binarySearch(int [] arr, int left , int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return true;
            if (arr[mid] < target)
                left = mid + 1;
            if (arr[mid] > target)
                right = mid - 1;
        }
        return false;
    }

    public static  void findSumPair(int [] arr , int sum)
    {
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
           int target=sum-arr[i];

           if(binarySearch(arr,i+1,arr.length-1,target))
               System.out.println("pair found : "+arr[i]+" "+target);
        }
    }
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 ,12};
        int n = 16;
     findSumPair(A,n);
    }
    }
