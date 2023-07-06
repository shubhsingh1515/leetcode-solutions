class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int total=0;
        int w=Integer.MAX_VALUE;
        for(r=0;r<nums.length;r++){
            total+=nums[r];
            while(total>=target){
            w=Math.min(w,r-l+1);
            total-=nums[l];
            l++;
            }
        }
        return w==Integer.MAX_VALUE ? 0 : w;
    }
}
