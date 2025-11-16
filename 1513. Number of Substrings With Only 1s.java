class Solution {
    public int numSub(String s) {
        long mod=1000000007;
        long ans=0,ones=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '1')
                ones++;
            else {
                ans += (ones*(ones+1)/2);
                ones=0;
            }
        }
        ans += (ones*(ones+1)/2);
        return (int)(ans%mod);
    }
}
