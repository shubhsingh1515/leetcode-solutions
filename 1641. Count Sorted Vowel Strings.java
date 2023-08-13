class Solution {
    public int countVowelStrings(int n) {
        int a=1;
        int b=1;
        int c=1;
        int d=1;
        int e=1;
        int ans;
        for(int i=1; i<n; i++){
            a=a+b+c+d+e;
            b=b+c+d+e;
            c=c+d+e;
            d=d+e;
        }
        ans=a+b+c+d+e;
        return ans;   
    }
}
