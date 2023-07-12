class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = {-1, -1};

        for (int i = 0; i < mat.length; i++) {
            int[] arr = mat[i];
            int sum = 0;

            for (int a: arr) {
                sum += a;
            }

            if (sum > result[1]) {
                result[0] = i;
                result[1] = sum;
            }
        }

        return result;
    }
}
