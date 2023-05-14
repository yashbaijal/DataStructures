public class Assignment
{
 public static void  numberOfToys(int [] arr,int total)
 {
     int sum=0;
     int count=0;
     Arrays.sort(arr);// can use nay sorting technique in interviews

     for(int i=0;i<arr.length;i++)
     {
         if(sum+arr[i]<=total)
         {
             sum=sum+arr[i];
             count++;
         }
     }
     System.out.println("Maximum number toys that can be bought are : "+count);
 }


    public static void main(String[] args) {

        int total = 50;
        int cost[] = {1, 12, 5, 111, 200, 1000, 10, 9, 12, 15};
        numberOfToys(cost,total);
    }
}
