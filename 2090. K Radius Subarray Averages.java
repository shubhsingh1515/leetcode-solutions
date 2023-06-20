class Solution {
    public int[] getAverages(int[] nums, int k) {
        int len=nums.length;
        int[] ans=new int[len];
        Arrays.fill(ans, -1);
        if (len<=2*k) {
            return ans;
        }
        
        long sum = 0;
        for (int i=0; i<2*k;i++) {
            sum += nums[i];
        }
        
        sum += nums[k+k];
        ans[k] =  (int)(sum/(2*k + 1));
        for (int i=k + 1 ; i<len-k;i++) {
            sum -= nums[i-k - 1];
            sum += nums[i+k];

            ans[i] = (int)(sum/(2*k + 1));
        }
        return ans;
        
    }
}
