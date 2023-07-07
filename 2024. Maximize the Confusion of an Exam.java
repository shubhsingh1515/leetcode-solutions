class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey,k,'T'),helper(answerKey,k,'F'));
    }
    public int helper(String s,int k,char c){
        int l=0,r=0,ans=0;
        while(r<s.length()){
            char curr=s.charAt(r);
            if(curr!=c){
                k--;
            }
            while(k<0){
                if(s.charAt(l)==c){
                    l++;
                }
                else{
                k++;
                l++;
                }
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
