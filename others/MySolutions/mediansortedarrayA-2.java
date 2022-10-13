import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// find the median of the two sorted arrays.
 // ex. {1, 3} and {2} is 2
 class Median 
{
  public static double logic(int[] A, int[] B) {
	  
	List<Integer> l=new ArrayList<Integer>();
	for(int a: A)
		l.add(a);
	for(int b: B)
		l.add(b);
	Collections.sort(l);
	int index=0;
	double ans=0.0;
	if(l.size()%2==0)
	{
		index=l.size()/2;
		ans=(l.get(index-1)+l.get(index))/2.0;
	    System.out.println(ans);
	    return ans;	
	}
	else
		index=(int) Math.floor((l.size()/2));
	    System.out.println(ans=l.get(index));
	    return ans;	 	
  }

  public static boolean pass()
  {
  boolean result = true;
  result = result && logic(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
  result = result && logic(new int[]{1, 3}, new int[]{2}) == 2.0;
  result = result && logic(new int[]{5,4,2,1,0}, new int[]{20,2}) == 2.0;
  result = result && logic(new int[]{3,4}, new int[]{5,6,7,8}) == 5.5;
  
  return result;
  };

  public static void main(String[] args)
  {
  if(pass())
  {
    System.out.println("pass");
  }
  else
  {
    System.out.println("some failures");
  }
  }
}