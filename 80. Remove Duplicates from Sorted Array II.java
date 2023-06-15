class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int pos=1;
        int count =0;
        for(int i = 1;i<len;i++){
            if(nums[i-1] == nums[i]){
                count++;
            }
            else{
                count = 0;
            }

            if(count <= 1){
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }
}
