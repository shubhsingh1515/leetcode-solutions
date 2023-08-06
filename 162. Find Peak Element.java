class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int lb=0;
        int ub=n-1;
        while(lb<ub){
            int mid=(lb+ub)/2;
            if(nums[mid]<nums[mid+1]){
                lb=mid+1;
            }
            else{
                ub=mid;
            } 
        }
        return lb;
    }
}
