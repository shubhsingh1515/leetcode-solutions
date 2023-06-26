class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end,k=0,mid;
        end=nums.length-1;
        while(start<=end){
             mid=(start+end)/2;
            if(nums[mid]<target){
                start=k=mid+1;
                
            }
            else if(nums[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return k;          
    }
}
