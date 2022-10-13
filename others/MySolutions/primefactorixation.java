/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
    public static ArrayList<Integer> primeFactorization(int num)
    {
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=2;i<num;i++)
        {
            while(num%i==0)
            {
                l.add(i);
                num=num/i;
            }
        }
        if(num>2)
        {
            l.add(num);
        }
        
        return l;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(primeFactorization(6) + " " + primeFactorization(5)+ " "+ primeFactorization(315)); 
	if(primeFactorization(6).equals(Arrays.asList(2,3)) 
			&& 
			primeFactorization(5).equals(Arrays.asList(5)) && primeFactorization(315).equals(Arrays.asList(3,3,5,7))
			) {
		System.out.println("All passed");
	}else {
		System.out.println("Failed");
	}
	}
}
