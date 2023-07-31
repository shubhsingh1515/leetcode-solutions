class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        for(int j=1;j<=n;j++){
            for(int i=0;i<n-j;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
        }
        return nums[0];
    }
}
