class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int numParts = (s.length() + k - 1) / k; 
        String[] result = new String[numParts];

        int index = 0;
        for (int i = 0; i < s.length(); i += k) {
            String part = "";

            for (int j = 0; j < k; j++) {
                if (i + j < s.length()) {
                    part += s.charAt(i + j);
                } else {
                    part += fill;  
                }
            }

            result[index++] = part;
        }

        return result;
    }
}
