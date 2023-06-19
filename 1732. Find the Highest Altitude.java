class Solution {
    public int largestAltitude(int[] gain) {
      int sum=0;
      int high=0;
      for(int i=0;i<gain.length;i++){
          sum+=gain[i];
          high=Math.max(sum,high);
      }
      return high;

    }
}
