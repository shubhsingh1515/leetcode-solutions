class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int n = s.length();
        int m = t.length();

        int count=0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                count++;
                i++;
            }
            j++;
        }
        if( n == count){
            return true;
        }
        else{
            return false;
        }
    }
}
