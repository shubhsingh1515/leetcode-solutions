class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> al = new ArrayList<>();
        al.add(words[0]);
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=groups[i-1]){
                al.add(words[i]);
            } 
        } 
        return al;
    }
}
