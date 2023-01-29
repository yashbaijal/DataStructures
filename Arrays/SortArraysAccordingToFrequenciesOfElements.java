package programs;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void sortArrayasFrequecies(int [] arr)
    {
        HashMap<Integer,Integer> countMap=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(countMap.containsKey(arr[i]))
            {
                countMap.put(arr[i],countMap.get(arr[i])+1);
            }
            else{
                countMap.put(arr[i],1);
            }
        }

        sortMapAsList(countMap);
    }

    public static void sortMapAsList(HashMap<Integer,Integer> map)
    {
        ArrayList<Map.Entry<Integer,Integer>> list= new ArrayList<>();

        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            list.add(e);
        }

        Comparator<Map.Entry<Integer,Integer>> mycomp= new Comparator<Map.Entry<Integer,Integer>>(){

            public int compare(Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2)
            {
                Integer i1=e1.getValue();
                Integer i2=e2.getValue();

                return i2.compareTo(i1);
            }
        };

        Collections.sort(list,mycomp);

        LinkedHashMap<Integer,Integer> lmap=new LinkedHashMap<>();

        for(Map.Entry<Integer,Integer> l:list)
        {
            lmap.put(l.getKey(),l.getValue());
        }

        System.out.println(lmap);

        List<Integer> res=new ArrayList<>();

        for (Integer i: lmap.keySet())
        {
            Integer value =lmap.get(i);
            while(value>0)
            {
                res.add(i);
                value--;
            }
        }

        System.out.println(res);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int [] arr={2, 5, 2, 8, 5, 6, 8, 8};

        sortArrayasFrequecies(arr);
    }
}
