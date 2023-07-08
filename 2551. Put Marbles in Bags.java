class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        int arr[]=new int[n-1];
        long ans=0;
        for(int i=0;i<n-1;i++){
         arr[i]=weights[i]+weights[i+1];
           
        }
         Arrays.sort(arr);
        for(int j=0;j<k-1;j++){
        ans+=arr[n-2-j]-arr[j];
        }

       return ans; 
    }
}
