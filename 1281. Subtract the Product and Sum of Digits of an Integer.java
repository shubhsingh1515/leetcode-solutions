class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int dig;
        int sum=0;
        while(n!=0){
            dig=n%10;
            mul=mul*dig;
            sum=sum+dig;
            n=n/10;
        }
        return (mul-sum);
    }
}
