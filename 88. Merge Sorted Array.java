class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];

        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[i+m]=nums2[i];
        }
        
        for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
        Arrays.sort(nums1);

    }
}
