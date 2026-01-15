import java.util.*;
public class merge_interval {
    public static void main(String[] args) {
        int[][] intervals=new int[][]{{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
        List<int[]> list=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int curstart=intervals[i][0];
            int curend=intervals[i][1];
            if(curstart<=end){
                end=Math.max(end,curend);
            }
            else{
                list.add(new int[]{start,end});
                start=curstart;
                end=curend;
            }
        }
        list.add(new int[]{start,end});
        for (int[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }


    }
}

