//Given an array of meeting time intervals consisting of start and end times 
// [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
//
//Example 1:
//
//Input: [[0,30],[5,10],[15,20]]
//Output: false
//Example 2:
//
//Input: [[7,10],[2,4]]
//Output: true

public class Assignment {

      public static  boolean canAttendMeeting(int [][] intervals)
      {
         // Arrays.sort(intervals,(a,b)->a[0]==b[0]?a[1]=b[1]:a[0]-b[0]);
          Arrays.sort(intervals, new Comparator<int[]>() {
              @Override
              public int compare(int[] a, int[] b) {
                  return a[0]==b[0]?a[1]=b[1]:a[0]-b[0];
              }
          });

          for(int i=1;i<intervals.length;i++)
          {
              if(intervals[i][0]<intervals[i-1][i])
              {
                  return false;
              }
          }
          return true;
      }
        public static void main(String args[]) {
           int [][] intervals=new int[3][2];
            intervals[0][0]=0;
            intervals[0][1]=30;

            intervals[1][0]=5;
            intervals[1][1]=10;

            intervals[2][0]=15;
            intervals[2][1]=20;

            System.out.println(canAttendMeeting(intervals)?"user can attend meetings ":"cannot take meetings");
        }
}
