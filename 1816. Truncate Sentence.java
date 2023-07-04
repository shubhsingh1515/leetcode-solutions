class Solution {
    public String truncateSentence(String s, int k) {
        int space=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
              space++;
            }
            if(space==k){
                break;
            }
            temp++;
        }
        s=s.substring(0,temp);
        return s;
    }
}
