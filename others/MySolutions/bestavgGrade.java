/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Integer bestAvgGrade(String [][] scores)
    {
        HashMap<String,ArrayList<Integer>> record= new HashMap<>();
        
        for(String [] scoreRow:scores)
        {
            String student=scoreRow[0];
            Integer score=Integer.parseInt(scoreRow[1]);
            
            ArrayList<Integer> marks=record.get(student);
            if(marks==null)
            {
                marks=new  ArrayList<Integer>();
                marks.add(score);
                record.put(student,marks);
            }
            else
            {
                 marks.add(score);
            }
        }
        
        double max=-Double.MAX_VALUE;
        
        for(ArrayList<Integer> studentmarks: record.values())
        {
            Integer sum=0;
            for(Integer i:studentmarks)
            {
                sum+=i;
            }
            double average=sum/(double)studentmarks.size();
            max=Math.max(max,average);
            
       }
       return (int)max;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String [][] scores={{"boby","87"},{"charles","100"},{"eric","75"},{"charles","22"}};
		System.out.println(bestAvgGrade(scores));
	}
}
