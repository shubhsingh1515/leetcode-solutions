class Solution {
    public long countBadPairs(int[] nums) {
       long n = nums.length;
        long goodPairs = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            int count = freqMap.getOrDefault(key, 0);
            goodPairs += count;  
            freqMap.put(key, count + 1);
        }

        long totalPairs = (n * (n - 1)) / 2;
        return totalPairs - goodPairs;

    }
}
