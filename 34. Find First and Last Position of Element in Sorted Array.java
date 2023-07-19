class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] ans = new int[2];
    int n=nums.length;
    int low=0;
    int high=n-1;
    ans[0]=First(nums, target,low,high);
    ans[1]=Last(nums, target,low,high);
    return ans;
}
 public int First(int nums[],int target,int low,int high) {
        int first=-1;
        while (low<=high) {
             int mid=(low+high)/2;
             if(nums[mid]==target){
                first=mid;
                high=mid-1;
             }
             else if(target>nums[mid]){
                 low=mid+1;
                }
                else{
                    high=mid-1;
             }
        }
        return first;
}
 public int Last(int nums[],int target,int low,int high) {
        int last=-1;

        while (low<=high) {
             int mid=(low+high)/2;
             if(nums[mid]==target){
                last=mid;
                low=mid+1;
             }
             else if(target>nums[mid]){
                 low=mid+1;
                }
                else{
                    high=mid-1;
             }
        }
        return last;
}
 
      
    }
