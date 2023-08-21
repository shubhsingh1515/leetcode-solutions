class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss=s+s;
        String s1=ss.substring(1,ss.length()-1);
        return s1.contains(s);
    }
}
