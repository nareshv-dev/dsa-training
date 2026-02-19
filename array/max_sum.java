class max_sum {
    public int maximizeSum(int[] nums, int k) {
        //https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int sum=0;
        while(k>0){
            sum+=a;
            a++;
            k--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        max_sum solution=new max_sum();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }        
        int k=sc.nextInt();
        int result=solution.maximizeSum(nums, k);
        System.out.println(result);
    }
}
