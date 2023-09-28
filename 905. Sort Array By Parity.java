class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i]%2==1){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--; 
            }
            if(nums[i]%2==0) i++;
        }
        return nums;
    }
}
