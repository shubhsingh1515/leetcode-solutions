class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        int ans=0;
        
        for(int i=0;i<arr1.length;i++){
            int k=arr1[i];
            while(k>0){
                hs.add(k);
                k/=10;
            }
        }
        for(int i=0;i<arr2.length;i++){
            int x=arr2[i];
            int len = String.valueOf(x).length();
            while(x>0){
             
                if(hs.contains(x)){
                    ans=Math.max(ans,len);
                }
            x/=10;
            len--;
            }
            
        }
        return ans;
    }
}
