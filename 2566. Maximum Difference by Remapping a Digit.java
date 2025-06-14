class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        int first = 0;
        int max = 0;
        int min = 0;
        int j = 0;
        while(j < c.length){
            if(9 != c[j] - '0'){
                break;
            }
            j+=1;
        }
        if(j >= c.length) j = 0;
        for(int i = 0; i < c.length; i++){
            max *= 10;
            if(c[i] == c[j]) max += 9;
            else max += (int)(c[i] - '0');
        }
        for(int i = 0; i < c.length; i++){
            min *=10;
            if(c[i] == c[0]) min += 0;
            else min += (int)(c[i]-'0');
        }
        return max - min;
    }
}
