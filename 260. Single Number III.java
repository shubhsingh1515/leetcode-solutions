class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans[]=new int[2];
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int j=0;
        for(int i:nums){
            if(hm.get(i)==1){
            ans[j]=i;
            j++;
            }
            if(j==2)  break;
        }
        return ans;
    }
}
