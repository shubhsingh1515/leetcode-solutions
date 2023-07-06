class Solution {
    public boolean isUgly(int n) {
        while(n>=1){
            if(n==1)
            return true;

            if((n%2!=0)&&(n%3!=0)&&(n%5!=0)){
            break;
            }
            if(n%2==0)
            n/=2;

            if(n%3==0)
            n/=3;

            if(n%5==0)
            n/=5;

        }
        return false;
    }
}
