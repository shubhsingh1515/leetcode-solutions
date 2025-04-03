class Solution {
    public long maximumTripletValue(int[] nums) {
       long Max = 0;
       int n = nums.length;

       int prefix[] = new int[n];
       prefix[0]= nums[0];
       for(int i =1; i< n; i++){ 
        prefix[i] = Math.max(prefix[i-1] , nums[i]);
       }

       int suffix[] = new int[n];
       suffix[n-1] = nums[n-1];
       for(int k = n - 2; k >= 0; k--){
        suffix[k] = Math.max(suffix[k+1] , nums[k]);
       }

       for(int j = 1 ; j<n-1; j++){
        long val = (long)(prefix[j-1] - nums[j])*suffix[j+1];
        
        Max = Math.max(val , Max);
       }
      return Max;
    }
}
