class Solution {
    public String removeDuplicateLetters(String s) {
        
        Stack<Character> st = new Stack();
        int taken[] = new int[26];
        int freq [] = new int[26];
        for(int i = 0 ;i < s.length() ;i++){
               char ch = s.charAt(i);
               freq[ch - 'a']++;
        }
        for(int i = 0 ;i < s.length() ; i++){

            char ch = s.charAt(i);
           if(taken[ch-'a'] != 0) { 
               freq[ch-'a']--;
               continue;
           }
            while(st.size() > 0 && st.peek() > ch && freq[st.peek()-'a'] > 1) {
                
                char top = st.pop();
                taken[top-'a']--;
                 freq[top-'a']--;
            }
            if(taken[ch-'a'] == 0) {
                taken[ch-'a']++;
                st.push(ch);
            }
        }
       StringBuilder sb = new StringBuilder();
        while(st.size() > 0) {
           char ch = st.pop();
           sb.insert(0,ch);
        }
        return sb.toString();
    }
}
