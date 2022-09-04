/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Reverse a String without affecting special characters
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void reverse(char arr [])
    {
        char [] temp=new char[arr.length];
        int pointer=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' &&  arr[i]<='z' ||  arr[i]>='A' && arr[i]<='Z')
            {
                temp[pointer]=arr[i];
                pointer++;
            }
        }
         
        swap(temp,0,pointer);
        
        pointer=0;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>='a' &&  arr[i]<='z' ||  arr[i]>='A' && arr[i]<='Z')
            {
                arr[i]=temp[pointer];
                pointer++;
            }
        }
       
        
        String output= new String(arr);
        System.out.println(output);
    }
    
    public static void swap(char [] arr,int start,int end)
    {
        end=end-1;
        while(start<=end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "Ab,c,de!$";
		reverse(str.toCharArray());
	}
}
