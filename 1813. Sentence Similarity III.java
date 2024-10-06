class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        
        int s = 0;
        int l1 = s1.length - 1;
        int l2 = s2.length - 1;

        if (s1.length > s2.length) 
            return areSentencesSimilar(sentence2, sentence1);

        while (s < s1.length && s1[s].equals(s2[s])) {
            s++;
        }
        while (l1 >= s && s1[l1].equals(s2[l2])) {
            l1--;
            l2--;
        }

        return l1 < s;
    }
}
