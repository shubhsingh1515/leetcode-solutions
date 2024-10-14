class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            maxHeap.offer(num);
        }
        long sum=0;
        while(k>0){
            int max=maxHeap.poll();
            sum+=max;
            maxHeap.offer((int)Math.ceil(max/3.0));
            k--;
        }
        return sum;
    }
}
