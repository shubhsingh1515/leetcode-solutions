class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[idx])
            k++;

            if(k==3){
            k=0;
            idx=i+1;
            }
        
        }
        return nums[idx];
    }
}
