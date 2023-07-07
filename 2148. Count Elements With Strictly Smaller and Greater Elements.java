class Solution {
    public int countElements(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[0] && nums[i]<nums[n-1])
            count++;
        }
        return count;
    }
}
