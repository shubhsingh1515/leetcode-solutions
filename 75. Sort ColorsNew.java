import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
    int cnt0=0, cnt1=0, cnt2=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0) cnt0++;
        else if(nums[i]==1) cnt1++;
        else cnt2++;
    }
    int m=0;
    for(int i=0;i<cnt0;i++){ nums[m]=0; m++;}
    for(int i=0;i<cnt1;i++){ nums[m]=1; m++;}
    for(int i=0;i<cnt2;i++){ nums[m]=2; m++;}
    }
}
