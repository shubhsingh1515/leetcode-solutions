class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int x=nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[x-1];
            nums[x-1]=nums[x-1]+1;
            
        }
        
        return sum;
    }
}
