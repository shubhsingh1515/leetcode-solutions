class Solution {
    public int minOperations(int[] nums, int k) {
        if (nums.length < 2) return 0;
        int ans = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i : nums) pq.add((long)i);
        while (pq.peek() < k) { 
            long s1 = pq.poll();
            long s2 = pq.poll();
            long n = s1 * 2 + s2;
            pq.add(n);
            ans++;
        }
        return ans; 
    }
}
