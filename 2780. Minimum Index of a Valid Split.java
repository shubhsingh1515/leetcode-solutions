public class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int dominantElement = 0;
        int maxCount = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Identify the dominant element
        for (int num : nums) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                dominantElement = num;
            }
        }

        int currentCount = 0;
        for (int i = 0; i < n; ++i) {
            if (nums.get(i) == dominantElement) {
                currentCount++;
            }
            int remainingCount = maxCount - currentCount;
            if (currentCount * 2 > i + 1 && remainingCount * 2 > n - i - 1) {
                return i;
            }
        }

        return -1;
    }
} 
