class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int lb = 0;
        int ub = n - 1;
        while(lb <= ub){
            int mid = (lb + ub)/2;
            int miss = arr[mid] - (mid + 1);
            if(miss < k){
                lb = mid + 1;
            }else{
                ub = mid - 1;
            }
        }
        return lb + k;
    }
}
