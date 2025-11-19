class Solution {
    public int findFinalValue(int[] nums, int original) {
       int ans = original;
       HashSet<Integer> hs = new HashSet<>();

       for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
       }
       while(hs.contains(ans)){
        ans = ans * 2;
       }
       return ans;
        
    }
}
