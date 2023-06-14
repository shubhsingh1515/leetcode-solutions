class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
      double[] nums3=new double[n+m];
      for(int i=0;i<n;i++){
          nums3[i]=nums1[i];
      }  
      for(int i=0;i<m;i++){
          nums3[n+i]=nums2[i];
      }
      Arrays.sort(nums3);
      int k=nums3.length;
      if(k%2!=0){
      return nums3[k/2];
      }
      else{
      return (nums3[k/2]+nums3[k/2-1])/2;
      }
    }
}
