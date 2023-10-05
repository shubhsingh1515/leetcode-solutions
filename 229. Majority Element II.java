class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int k = (nums.length)/3;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int i:hm.keySet()){
            if(hm.get(i)>k){
                li.add(i);
            }
        }
        return li;
    }
}
