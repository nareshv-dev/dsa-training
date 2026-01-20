import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mini_abs_diff {
    //https://leetcode.com/problems/minimum-absolute-difference/description/
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min=Math.abs(arr[0]-arr[1]);
        Arrays.sort(arr);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            int mini=Math.abs(arr[i]-arr[i+1]);
            if(mini<min){
                min=mini;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            int m=Math.abs(arr[i]-arr[i+1]);
            List<Integer> list=new ArrayList<>();
            if(m==min){
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        mini_abs_diff mad=new mini_abs_diff();
        int[] arr= {4,2,1,3};
        List<List<Integer>> res=mad.minimumAbsDifference(arr);
        for(List<Integer> l:res){
            System.out.println(l);
        }
    }
}
