class Solution {
    public int maximumBeauty(int[] nums, int k) {
        // TreeMap<Integer,Integer> hm=new TreeMap<>();
        // for(int i:nums){
        //     int left=i-k;
        //     int right=i+k+1;
        //     hm.put(left,hm.getOrDefault(left,0)+1);
        //     hm.put(right,hm.getOrDefault(right,0)-1);
        // }
        // int max=0;
        // int sum=0;
        // for(int key:hm.keySet()){
        //     sum=sum+hm.get(key);
        //     max=Math.max(max,sum);
        // }
        // return max;

        int ans = 0, l = nums.length, start = 0, i = 0;
        Arrays.sort(nums);
        k *= 2;
        for(; i < l - 1; i++) {
            ans = Math.max(ans, i - start + 1);
            while(nums[i + 1] > nums[start] + k) {
                start++;
            }
        }
        return Math.max(ans, i - start + 1);
    }
}
