/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static String reverse(String input)
    { 
        char [] a=input.toCharArray();
        int begin=0;
        int end=input.length()-1;
        
        char temp ;
        while(begin<end)
		{
			temp=a[begin];
			a[begin]=a[end];
			a[end]=temp;
			begin++;
			end--;
		}
      return   String.valueOf(a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s= "this is my first java training class in gojek";
		
		String [] arr=s.split(" ");
		
		Stack<String> stack= new Stack();
		
		List<String> list=new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
		    stack.push(arr[i]);
		}
		
		while(!stack.isEmpty())
		{
		    list.add(stack.peek());
		    stack.pop();
		}
		
		for(int i=0;i<list.size();i++)
		{
		    if(i%3==0)
		    list.set(i,reverse(list.get(i)));
		}
		
		System.out.println(list);
		
		
	}
}
