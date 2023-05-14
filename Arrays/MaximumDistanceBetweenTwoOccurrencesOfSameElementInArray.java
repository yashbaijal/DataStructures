public class Assignment
{
   public static void maxdiff(int [] arr)
{
    int n=arr.length;
    int maxD=-1;

    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                int temp=j-i;
                maxD=maxD> temp? maxD:temp;
            }
        }
    }
    System.out.println("max distance is : "+maxD);
}

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 1, 3, 4, 2, 5, 6, 5 };
        maxdiff(arr);
    }
}

TC=O(n^2) , SC=O(1)
==============================================================
  
  public static void maxdiff(int [] arr)
{
    int n=arr.length;
    int maxD=0;

    HashMap<Integer,Integer> hmap=new HashMap<>();

    for(int i=0;i<n;i++)
    {

        if(!hmap.containsKey(arr[i]))
        {
            hmap.put(arr[i],i);
        }
        else
        {
            maxD=Math.max(maxD,i-hmap.get(arr[i]));
        }
    }
    System.out.println("max distance is : "+maxD);
}

TC=O(n) , SC=O(n)
 =============================================================
