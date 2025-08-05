class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = 0;
        for(int i = 0; i < fruits.length; i++) {
            for(int j = 0; j < baskets.length; j++) {
                if(baskets[j] >= fruits[i]) {
                    cnt++;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        return fruits.length - cnt;
    }
}
