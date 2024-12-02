class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i=0;
        for(String word : sentence.split(" ")) {
            if(word.startsWith(searchWord)) {
                return i+1;
            }
            i++;
        }
        return -1;
    }
} 
