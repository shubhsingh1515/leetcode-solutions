class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            if(lsum==sum-nums[i]){
                return i;
            }
            lsum+=nums[i];
            sum-=nums[i];
        }
        return -1;
        
    }
}
