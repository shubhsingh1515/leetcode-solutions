class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length/3][3];
        int j = 0;
        for(int i=0; i<nums.length; i+=3){
            if(nums[i+2] - nums[i] <= k ){
                result[j][i % 3] = nums[i];
                result[j][(i+1) % 3] = nums[i+1];
                result[j][(i+2) % 3] = nums[i+2];
            }
            else return new int[0][0];
            j++;
        }
        return result;
    }
}
