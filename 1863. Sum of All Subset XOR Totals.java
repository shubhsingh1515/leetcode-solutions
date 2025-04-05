class Solution {
    public int subsetXORSum(int[] nums) {
          int k = 0;
        for (int num : nums) {
            k |= num;
        }
        return k * (1 << (nums.length - 1));
    }
}
