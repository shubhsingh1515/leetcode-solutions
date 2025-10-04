class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int ans=0,mini=0;
        while(l<r)
        {
            mini= Math.min(h[l],h[r])*(r-l);
            ans= Math.max(mini,ans);
            if(h[l]<h[r]) l++;
            else r--;
        }
        return ans;
    }
}
