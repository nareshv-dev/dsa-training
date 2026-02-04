public class monotonic_arr {
    public boolean isMonotonic(int[] nums) {
        //https://leetcode.com/problems/monotonic-array/description/
        int incre=1;
        int decre=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                incre++;
            }
            if(nums[i]<=nums[i+1]){
                decre++;
            }
        }
        if(incre == nums.length || decre==nums.length){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        monotonic_arr ma=new monotonic_arr();
        int[] arr= {1,2,2,3};
        System.out.println(ma.isMonotonic(arr));
    }
}
