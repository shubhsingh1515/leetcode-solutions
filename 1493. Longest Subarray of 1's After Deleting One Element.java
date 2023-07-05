class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0;
        int curr = 0;
        int maxlength = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                curr++;
                if(curr + prev > maxlength)
                maxlength = curr + prev;
            }
            else if(nums[i] == 0){
                prev = curr;
                curr = 0;
            }
        }
        if(maxlength == nums.length)
         return maxlength - 1;
         return maxlength;
    }
}
