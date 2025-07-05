class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer>map : hm.entrySet()){
            int k = map.getKey();
            int v = map.getValue();
            if(k==v){
                ans = Math.max(ans, k);
            }
        }
        return ans;
        
    }
}
