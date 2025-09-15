class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s=text.split(" ");
        Set<Character> st=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            st.add(brokenLetters.charAt(i));
        }
        int ans=0;
        for(int i=0;i<s.length;i++){
            for(char ch:s[i].toCharArray()){
                if(st.contains(ch)){
                    ans--;
                    break;
                }              
                }
                ans++;
            }
        return ans;
    }
}
