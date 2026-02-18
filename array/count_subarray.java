import java.util.*;
class count_subarray {
    public int subarraySum(int[] nums, int k) {

        //https://leetcode.com/problems/subarray-sum-equals-k/description/
        HashMap<Integer,Integer> map=new HashMap<>();
        int pre=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            int remove=pre-k;
            count+=map.getOrDefault(remove,0);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        count_subarray solution=new count_subarray();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }        
        int k=sc.nextInt();
        int result=solution.subarraySum(nums, k);
        System.out.println(result);
    }
}
