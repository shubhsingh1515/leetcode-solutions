class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
      int n1 = nums1.length, n2 = nums2.length;

        if (n1%2==0 && n2%2==0) return 0;

        int xor1 = 0, xor2 = 0;

        for (int num : nums1) {
            xor1 ^= num;
        }
        if (n1 % 2 == 0) return xor1;

        for (int num : nums2) {
            xor2 ^= num;
        }
        if (n2 % 2 == 0) return xor2;
        

        return xor1 ^ xor2;  
    }
}
