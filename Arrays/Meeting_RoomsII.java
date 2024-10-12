//Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] 
//(si < ei), find the minimum number of conference rooms required.
//For example, Given [[0, 30],[5, 10],[15, 20]], return 2.

//to solve above question we have to store start time and end time in separate arrays and
//	sort each of them . Now we compare start time with end time elemets
//	if stattime<endtime it means meeting has started and increment index of starttime
//	if starttime>endTime it means meeting has ended and increment index of endtime
//	so overall logic is to count number of overlapping meetings as number of overlaped meeeting is equals to number of seperate rooms required.
Time = O(n log n) Space=O(n)
public class Assignment {

    public static int minMeetingRooms(int [][]intervals)
      {
         int len=intervals.length;
         int [] startTime= new int[len];
         int [] endTime= new int [len];
         int index=0;
         for(int [] interval:intervals)
         {
             startTime[index]=interval[0];
             endTime[index++]=interval[1];
         }
         Arrays.sort(startTime);
         Arrays.sort(endTime);
         int i=0,j=0;
         int activate=0, max=0;

         while(i<len && j<len)
         {
             if(startTime[i]<endTime[j])
             {
                 activate++;// shows meeting has started
                 i++;
             }
             else
             {
                 activate--; // shows meeting has ended
                 j++;
             }
             max=Math.max(max,activate);
         }
         return max;

      }

        public static void main(String args[]) {
           int [][] intervals=new int[3][2];
            intervals[0][0]=0;
            intervals[0][1]=30;

            intervals[1][0]=5;
            intervals[1][1]=10;

            intervals[2][0]=15;
            intervals[2][1]=20;

            System.out.println("min meeting rooms required are : "+minMeetingRooms(intervals));
        }
}
