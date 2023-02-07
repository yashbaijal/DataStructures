//TC=O(n+m)  SC=O(n+m) union is distinct elents of arr1+arr2
class Codechef
{
    public static void unionOfTwoArrays(int arr1[],int arr2[],int n,int m)
    {
         int i=0,j=0;
        ArrayList<Integer> union=new ArrayList<>();
        
        while(i<n && j<m)
        {
            if(arr1[i]<=arr2[j])
            {
                if(union.size()==0 || union.get(union.size()-1)!= arr1[i])// we are cheking if last element added in list shouls not be same 
                {                                                         // to remove duplication entries
                    union.add(arr1[i]);
                }
                 i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!= arr2[j])
                { 
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        
        while(i<n)
        {
            if(union.get(union.size()-1)!= arr1[i])
                {
                    union.add(arr1[i]);   
                }
                i++;
        }
        
        while(j<m)
        {
            if(union.get(union.size()-1) != arr2[j])
                {
                    union.add(arr2[j]);  
                }
                 j++;
        }
        
        for (int val: union)
        {
    System.out.print(val+" ");
}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        
        unionOfTwoArrays(arr1,arr2,arr1.length,arr2.length);
	}
}
