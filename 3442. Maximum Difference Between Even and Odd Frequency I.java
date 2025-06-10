class Solution {
    public int maxDifference(String s) {
     int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        int even = Integer.MAX_VALUE;
        int odd = Integer.MIN_VALUE;

        for(int i =0; i<26;i++){
            if(arr[i]%2==0 && arr[i]!=0){
                even = Math.min(even,arr[i]);
            }
            else{
                odd = Math.max(odd, arr[i]);
            }
        }
        return odd-even;   
    }
}
