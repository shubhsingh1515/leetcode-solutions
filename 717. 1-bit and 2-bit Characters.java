class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int pointer = 0;

        while (pointer < n - 1) {
            if (bits[pointer] == 1) {
                pointer += 2;
            } else {
                pointer += 1;
            }
        }
        return pointer == n - 1;
    }
}
