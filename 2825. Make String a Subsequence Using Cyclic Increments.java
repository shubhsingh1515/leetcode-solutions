class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if (n2 > n1) return false;

        int p1 = 0, p2 = 0;

        while (p1 < n1 && p2 < n2) {
            char ch1 = str1.charAt(p1);
            char ch2 = str2.charAt(p2);

            if (ch1 == ch2 || (ch1 == 'z' && ch2 == 'a') || ch1 + 1 == ch2) {
                p2++;
            }
            p1++;
        }

        return p2 == n2;
    }
}
