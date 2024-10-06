/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Reverse words of string
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String reverse(String str)
    {
        String [] arr=str.split(" ");
        String res=" ";
        String output=" ";
        
        for(int i=arr.length-1;i>=0;i--)
        {
                  res=arr[i];
             output=output+" "+res;
           
        }
        return output;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String str="this is my first java programme";
		
	   System.out.println(reverse(str));
	}
}
========================================================
	public static void logic(String s)
    {
        String [] arr= s.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i].toUpperCase();
            char ch=Character.toLowerCase(arr[i].charAt(0));
            String res=arr[i].substring(1);
            arr[i]=ch+res;
        }
        swapWords(arr);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=reverse(arr[i]);
        }
        String out=String.join(" ",arr);
        System.out.println("reversed words : "+out);
    }

    public static void swapWords(String [] arr)
    {
        int s=0 , e=arr.length-1;
        while(s<=e)
        {
            String temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    public static String reverse(String s)
    {
        char [] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            char ch=arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
