class Solution {
    public int alternateDigitSum(int n) {
        int k=1;
        int Sum1 = 0;
        int Sum2 = 0;
        while(n!=0){
            int dig=n%10;
            if(k%2 == 0){
                Sum1+=dig;
            }else{
                Sum2+=dig;
            }
            k++;
            n=n/10;
        }
        if(k%2==0)return Sum2-Sum1;
        return Sum1-Sum2;
    }
}
