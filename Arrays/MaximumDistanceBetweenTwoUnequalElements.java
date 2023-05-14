/*
e pair of unequal elements must include either first or last element or both, calculate the longest distance between unequal element 
by traversing the array either by fixing the first element or fixing the last element.
*/

public class Assignment
{
   public static void maxdiff(int [] arr,int n)
{
    if(arr[0]!=arr[n-1])
        System.out.println(n-1);

    int idx=n-1;

    while(idx>0) //Fix first element as one of the elements and start traversing from the right
    {
        if(arr[idx]!=arr[0])
            break;
        idx--;
    }

    int distFirst=(idx==0)?-1:idx; // store the distance from the first element

    idx=0;

    while(idx<n-1) //// Fix last element as one of the elements and start traversing from the left
    {
        if(arr[idx]!=n-1)
        break;
        idx++;
    }

    int distLast=(idx==n-1)?-1:idx; //store the distance from the last element

    int maxDist=Math.max(distFirst,distLast);

    System.out.println("max dist is :"+maxDist);
}

    public static void main(String[] args) {

        int[] arr = { 4, 4, 1, 2, 1, 4 };
        int n=arr.length;
        maxdiff(arr,n);
    }
}

TC=o(n) SC=O(1)
==========================================================
