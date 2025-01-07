class Solution {
    public List<String> stringMatching(String[] words) {
       List<String> result = new ArrayList<>();
        
        for (String word : words) {
            for (String other : words) {
                if (!word.equals(other) && other.contains(word) && !result.contains(word)) {
                    result.add(word);
                    break;
                }
            }
        }
        return result; 
    }
}
