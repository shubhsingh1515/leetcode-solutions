class Solution {
    public int maxAscendingSum(int[] nums) {
        int max_sum=nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cur+=nums[i];
                max_sum=Math.max(max_sum, cur);
            }else{
                cur=nums[i];
            }
        }
        return max_sum;
    }
}
