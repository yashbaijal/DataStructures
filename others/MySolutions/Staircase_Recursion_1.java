/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			System.out.println(countSteps(4));
	}
	
static ArrayList<String> getstairpath(int n)
	{
	    if(n==0)
	    {
	       ArrayList<String> bres=new ArrayList<>();
	       bres.add("");
	       return bres;
	    }
	    else if(n<0)
	    {
	       ArrayList<String> bres=new ArrayList<>();
	       return bres;
	    }
	    
	    ArrayList<String> paths1=getstairpath(n-1);
	    ArrayList<String> paths2=getstairpath(n-2);
	    ArrayList<String> paths3=getstairpath(n-3);
	    
	    ArrayList<String> paths= new ArrayList<>();
	    
	    for(String path1:paths1)
	    {
	       paths.add(1+path1);
	    }
	    
	     for(String path2:paths2)
	    {
	       paths.add(2+path2);
	    }
	    
	     for(String path3:paths3)
	    {
	       paths.add(3+path3);
	    }
	    
	    return paths;
	}
	
	static Integer countSteps(int n)
	{
	    
	   ArrayList<String> stepcount= getstairpath(n);
	   
	   return stepcount.size();
	}
}
