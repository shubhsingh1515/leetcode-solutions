class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int a=2;
        int b=3;
        int num=0;
        for(int i=4;i<=n;i++){
            num=a+b;
            a=b;
            b=num;
        }
        return num; 
    }
}
