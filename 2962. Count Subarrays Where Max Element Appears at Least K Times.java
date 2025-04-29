class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int left = 0;
        int right = 0;
        int freq = 0;
        long cnt = 0;

        while (right < nums.length) {
            if (nums[right] == max) {
                freq++;
            }
            while (freq >= k) {
                cnt += nums.length - right;
                if (nums[left] == max) {
                    freq--;
                }
                left++;
            }
            right++;
        }
        return cnt; 
    }
}
