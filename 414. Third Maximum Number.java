class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
       ArrayList<Integer> a1=new ArrayList<>();
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]==nums[i+1]){
               continue;
           }
           a1.add(nums[i]);
       }
       a1.add(nums[nums.length-1]);
       int k=a1.size();
        if (k < 3) {
            return a1.get(k - 1);
        } else {
            return a1.get(k-3);
        }
    }
}
