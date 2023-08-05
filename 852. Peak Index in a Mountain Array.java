class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int begin=0,end=n-1;
        while(true){
            int k=(begin+end)/2;
            if(arr[k-1]<arr[k] && arr[k+1]<arr[k])
            return k;
            else if(arr[k-1]<arr[k] && arr[k+1]>arr[k])
            begin=k;
            else if(arr[k-1]>arr[k] && arr[k+1]<arr[k])
            end=k;
        }
    }
}
