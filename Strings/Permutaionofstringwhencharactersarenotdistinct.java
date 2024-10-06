/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Permutaion of string when characters are not distinct
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void getPermutauions(int cs,int ts,Map<Character,Integer> fmap,String res)
    {
        if(cs>ts)
        {
            System.out.println(res);
            return;
        }
        
        for(char ch : fmap.keySet())
        {
            if(fmap.get(ch)>0)
            {
                fmap.put(ch,fmap.get(ch)-1);
                getPermutauions(cs+1,ts,fmap,res+ch);
                fmap.put(ch,fmap.get(ch)+1);
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String str="aabb";
		
		HashMap<Character,Integer> fmap=new HashMap<>();
		for (char ch:str.toCharArray())
		{
		    if(fmap.containsKey(ch))
		    {
		        fmap.put(ch,fmap.get(ch)+1);
		    }
		    else{
		        fmap.put(ch,1);
		    }
		}
		
		getPermutauions(1,str.length(),fmap,"");
	}
}
=====================================================================================
public static  void printpermute(String s,String ans)
    {
         boolean [] visited= new boolean[256];
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String res=s.substring(0,i)+s.substring(i+1);
            if(visited[ch-'a']==false)
            {
                printpermute(res,ans+ch);
                visited[ch-'a']=true;
            }
        }
    }
	
