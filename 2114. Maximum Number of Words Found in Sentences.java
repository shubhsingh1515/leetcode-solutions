class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=1;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String s=sentences[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    count++;
                }
            }
            maxCount=Math.max(maxCount,count);
            count=1;
        }
        return maxCount;
    }
}
