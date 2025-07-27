class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        int[] temp = new int[nums.length];
        int index = 0;
        temp[index++] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                temp[index++] = nums[i];
            }
        }

        for(int i=1;i<index-1;i++){

            if(temp[i]>temp[i-1] && temp[i]>temp[i+1]){
                count++;
            }

            else if(temp[i]<temp[i-1] && temp[i]<temp[i+1]){
                count++;
            }
            
        }
        return count;
    }
}
