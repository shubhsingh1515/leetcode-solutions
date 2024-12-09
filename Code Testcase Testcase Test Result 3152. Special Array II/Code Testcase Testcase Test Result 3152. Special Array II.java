class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] ans = new boolean[queries.length];
        int[] prefix = new int[n];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + (nums[i - 1] % 2 != nums[i] % 2 ? 1 : 0);
        }

        for (int q = 0; q < queries.length; q++) {
            int start = queries[q][0];
            int end = queries[q][1];
            int breaksInRange = prefix[end] - prefix[start];
            ans[q] = (breaksInRange == (end - start));
        }

        return ans;
    }
}
