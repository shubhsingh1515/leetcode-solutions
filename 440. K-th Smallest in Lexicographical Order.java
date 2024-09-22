class Solution {
    private int countNumbersInRange(long currentPrefix, long nextPrefix, long limit) {
        int count = 0;
        while (currentPrefix <= limit) {
            count += Math.min(limit + 1, nextPrefix) - currentPrefix;
            currentPrefix *= 10;
            nextPrefix *= 10;
        }
        return count;
    }

    public int findKthNumber(int limit, int k) {
        long currentNumber = 1;
        for (int position = 1; position < k;) {
            int numbersCount = countNumbersInRange(currentNumber, currentNumber + 1, limit);
            if (position + numbersCount <= k) {
                position += numbersCount;
                currentNumber++;
            } else {
                position++;
                currentNumber *= 10;
            }
        }
        return (int) currentNumber;
    }
}
