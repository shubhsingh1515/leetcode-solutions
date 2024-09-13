class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXOR = new int[arr.length + 1];
        
        for (int i = 0; i < arr.length; i++) {
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
           
            answer[i] = prefixXOR[right + 1] ^ prefixXOR[left];
        }

        return answer;
    }
}
