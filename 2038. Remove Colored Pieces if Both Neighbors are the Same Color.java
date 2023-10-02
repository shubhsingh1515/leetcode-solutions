class Solution {
    public boolean winnerOfGame(String colors) {
        int cnt1 = 0,a=0,cnt2=0,b=0;
        for(char c : colors.toCharArray()){
            if(c=='A'){
                cnt2=0;
                cnt1++;
                if(cnt1>=3)
                a++;
            }
            else{
                cnt1=0;
                cnt2++;
                if(cnt2>=3)
                b++;
            }
        }
        return a>b;
    }
}
