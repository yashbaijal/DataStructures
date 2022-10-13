/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Set<String> longestword(List<String> dict,char [] arr)
    {
        int [] avail=new int[26];
        for(char c:arr)
        {
            int index =c-'a';
            avail[index]++;
        }
        Set<String> result=new HashSet();
        HashMap<String ,Integer> map=new HashMap<>();
        int max=0;
        
        for(String word:dict)
        {
            int [] current= new int[26];
            boolean present=true;
            
            for(char c:word.toCharArray())
            {
                int index=c-'a';
                current[index]++;
                
                if(current[index]>avail[index])
                {
                    present=false;
                    break;
                }
            }
            
            if(present)
            {
                map.put(word,word.length());
            
            if(word.length()>max)
            {
                max=word.length();
            }
            
            }
            
        }
        
        for(Entry s:map.entrySet())
        {
            int i=(int)s.getValue();
            if(i==max)
            {
                String var=(String)s.getKey();
                result.add(var);
            }
            
        }
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		//List<String> l=Arrays.asList("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
	//	longestword(l,"oetgd".toCharArray());
	if(doTestsPass()) {
      System.out.println("All tests pass");
    } else {
      System.err.println("There are test failures");
    }
	}
	
	public static boolean doTestsPass()
	{
	    List<String> l=Arrays.asList("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
	    boolean result=true;
	    result=result && new HashSet<String>(Arrays.asList("toe")).equals(longestword(l,"toe".toCharArray()));
	    result=result && new HashSet<String>(Arrays.asList("doe","toe", "dog", "god")).equals(longestword(l,"oetdg".toCharArray()));
	    result=result && new HashSet<String>().equals(longestword(l,"aeiou".toCharArray()));
	    result=result && new HashSet<String>().equals(longestword(l,"a".toCharArray()));
	    //result=result && new HashSet<String>().equals(longestword(l,"ookb".toCharArray())); -ve test case
	    return result;
	}
}
