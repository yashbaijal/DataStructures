/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    HashMap<String , Integer> hm=new HashMap<>();
	    
	    hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        
        sortingOrder(hm);
        
	}
	
	public static void sortingOrder(HashMap<String ,Integer> hm)
	{
	    ArrayList<Map.Entry<String, Integer>> list=new ArrayList<>();
	    
	    for(Map.Entry<String, Integer> e:hm.entrySet())
	    {
	        list.add(e);
	    }
	    
	    //--------------------------------------------------------------
	    
	    Comparator<Map.Entry<String,Integer>> mycomparator = new Comparator<Map.Entry<String,Integer>>(){
	       
	       @Override
	       public int compare(Entry<String, Integer> e1,Entry<String, Integer> e2 )
	       {
	           Integer I1=e1.getValue();
	           Integer I2=e2.getValue();
	            
	           return I2.compareTo(I1); 
	            
	       }
	    };
	 //-------------------------------------------------------------------      
	       Collections.sort(list,mycomparator);
	       
	       LinkedHashMap<String , Integer> map =new LinkedHashMap<>();
	       
	       for(Map.Entry<String,Integer> l: list)
	       {
	           map.put(l.getKey(),l.getValue());
	       }
	        
	      System.out.println("HashMap sorted by values : "+ map);
	    }
	}
	

