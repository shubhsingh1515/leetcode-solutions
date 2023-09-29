class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incre=inc(nums);
        boolean decre=dec(nums);
        return (incre || decre);
    }
    public boolean inc(int []k){
        for(int i=0;i<k.length-1;i++){
            if(k[i]>k[i+1])
            return false;
        }
        return true;
    }
    public boolean dec(int []m){
        for(int i=0;i<m.length-1;i++){
            if(m[i]<m[i+1]){
                return false;
            }
        }
        return true;
    }
}
