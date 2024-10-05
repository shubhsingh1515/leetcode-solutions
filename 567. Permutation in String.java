class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        if (m > n) {
            return false;
        }
        
        // char[] s1Arr = s1.toCharArray();
        // Arrays.sort(s1Arr);
        
        // for (int i = 0; i <= n - m; i++) {
        //     String substring = s2.substring(i, i + m);
        //     char[] subArr = substring.toCharArray();
        //     Arrays.sort(subArr);
            
        //     if (Arrays.equals(s1Arr, subArr)) {
        //         return true;
        //     }
        // }
        // return false;    
      

        // Frequency arrays for s1 and the current window in s2
        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];
        
        // Fill the frequency array for s1
        for (int i = 0; i < m; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }
        
        // Sliding window approach
        for (int i = 0; i < n - m; i++) {
            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
            
            // Slide the window: remove the first character and add the next character
            windowFreq[s2.charAt(i) - 'a']--;
            windowFreq[s2.charAt(i + m) - 'a']++;
        }
        
        // Check for the last window
        return Arrays.equals(s1Freq, windowFreq);
 
    }
}
