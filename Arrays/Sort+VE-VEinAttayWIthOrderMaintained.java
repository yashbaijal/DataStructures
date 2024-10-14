public class Assignment {

    public  static void sortNumbers(int [] arr)
    {
        int left=0;
        int right=arr.length-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp=arr[i];
                int j=i;

                while(j>0 && arr[j-1]>0)
                {
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=temp;
            }

        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String args[]) {
     int [] arr= {12, 11 ,-13 ,-5, 6, -7 ,5, -3,-6};
     //-13 -5 -7 -3 -6 12 11 6 5
        sortNumbers(arr);
    }
}
