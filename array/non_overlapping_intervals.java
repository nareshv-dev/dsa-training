import java.util.*;
public class non_overlapping_intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals, (a,b) -> (a[1]-b[1]));
        int prevEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            if(start<prevEnd){
                count++;
            }
            else{
                prevEnd=intervals[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] intervals=new int[n][2];
        for(int i=0;i<n;i++){
            intervals[i][0]=sc.nextInt();
            intervals[i][1]=sc.nextInt();
        }
        non_overlapping_intervals solution=new non_overlapping_intervals();
        int result=solution.eraseOverlapIntervals(intervals);
        System.out.println(result);
    }
}