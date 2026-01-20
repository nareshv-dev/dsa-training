import java.util.*;
class three_sum {
    //https://leetcode.com/problems/3sum/description/ 
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                List<Integer> list=new ArrayList<>();
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    left++;
                    right--;
                    result.add(list);
                }
                else if(sum<0){
                    left++;

                }else{
                    right--;
                }
            }
        }
        Set<List<Integer>> set=new HashSet<>(result);
        return new ArrayList<>(set);
    }
    public static void main(String args[] ) throws Exception {
        three_sum ts=new three_sum();
        int[] arr= {-1,0,1,2,-1,-4};
        List<List<Integer>> res=ts.threeSum(arr);
        for(List<Integer> l:res){
            System.out.println(l);
        }
    }
}