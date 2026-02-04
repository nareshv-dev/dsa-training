class shuffle_array {
    public int[] shuffle(int[] nums, int n) {
        //https://leetcode.com/problems/shuffle-the-array/
        int[] res=new int[n*2];
        int j=0;
        for(int i=0;i<n;i++){
            res[j++]=nums[i];
            res[j++]=nums[i+n];
        }
        return res;
    }
    public static void main(String[] args) {
        shuffle_array sa=new shuffle_array();
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] result=sa.shuffle(nums,n);
        for(int val:result){
            System.out.print(val+" ");
        }
    }
}
