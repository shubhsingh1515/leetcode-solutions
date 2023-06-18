class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] arr1=jewels.toCharArray();
        char[] arr2=stones.toCharArray();
        for(char jew : arr1) {
            for(char sto : arr2) {
                if(jew  == sto) {
                    count++;
                }
            }
        }
        return count;
    }
}
