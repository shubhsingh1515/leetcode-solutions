class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String> set = new HashSet<>() ;
        int size = s.length() ;

        int[] left = new int[26] ;
        int[] right = new int[26] ;

        for(char ch : s.toCharArray()) {
            right[ch - 'a']++ ;
        }

        for(int i = 0 ; i < size ; i++) {
            char mid = s.charAt(i) ;
            right[mid - 'a']-- ;

            for(char ch = 'a' ; ch <= 'z' ; ch++) {
                if(left[ch - 'a'] > 0 && right[ch - 'a'] > 0) 
                    set.add("" + ch + mid + ch) ;
            }

            left[mid - 'a']++ ;
        }

        return set.size() ;  
    }
}
