class Solution {
    public int maxVowels(String s, int k) {
        int maxV = 0;
        int currV = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i), vowels)) {
                currV++;
            }
        }
        maxV = currV; 
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i), vowels)) {
                currV++;
            }
            if (isVowel(s.charAt(i - k), vowels)) {
                currV--;
            }
            maxV = Math.max(maxV, currV);
        }
        return maxV;
    }
    private boolean isVowel(char ch, char[] vowels) {
        for (char vowel : vowels) {
            if (ch == vowel) {
                return true;
            }
        }
        return false;
    }
}
