import java.util.Arrays;

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] lastSet = new int[32]; // Tracks the last index where each bit was set
        
        Arrays.fill(lastSet, -1);
        
        for (int i = n - 1; i >= 0; --i) {
            int maxLen = 1;
            for (int j = 0; j < 32; ++j) {
                if ((nums[i] & (1 << j)) != 0) {
                    lastSet[j] = i;
                }
                if (lastSet[j] != -1) {
                    maxLen = Math.max(maxLen, lastSet[j] - i + 1);
                }
            }
            answer[i] = maxLen;
        }
        
        return answer;
    }
}
