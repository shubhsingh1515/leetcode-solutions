class Solution {
    public int bestClosingTime(String customers) {
        int k=0,j=-1;
        int max=0;
        int n=customers.length();
        for(int i=0;i<n;i++) {
            if(customers.charAt(i) == 'Y'){
                k+=1;
            } 
            else
            k-=1;
            if(k > max) {
                max = k;
                j = i;
            }
        }
        return j + 1;
    }
}
