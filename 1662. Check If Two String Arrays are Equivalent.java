class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            ans.append(word1[i]);
        }
       StringBuilder res=new StringBuilder();
        for(int i=0;i<word2.length;i++){
            res.append(word2[i]);
        }
        if(ans.toString().equals(res.toString())){
            return true;
        }
        else{
            return false;
        }        
    }
}
