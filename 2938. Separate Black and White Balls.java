class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        int first=0,last=0;
        long cnt=0;
        while(last<n){
            char c=s.charAt(last);
            if(c=='0'){
            cnt+=last-first;
             first++;
            }
             last++;
        }
        return cnt;
    }
}
