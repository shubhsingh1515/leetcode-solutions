class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        int k=0;
        for(int i=left;i<=right;i++){
            int num=i;
            while(num>0){
                k=num%10;
                if(k!=0){
                    if(i%k!=0){
                    break;
                    }
                }
                else{
                    break;
                }
                
                num=num/10;
            }
            if(num==0){
                ans.add(i);
            }
        }
        return ans;
    }
}
