class Solution {
    public long pickGifts(int[] gifts, int k) {
    // int count = 0;
    // while (count < k) {
    //     Arrays.sort(gifts);
    //     gifts[gifts.length - 1] = (int) Math.sqrt(gifts[gifts.length - 1]);
    //     count++;
    // }
    // long total = 0;
    // for (int gift : gifts) {
    //     total += gift;
    // }
    // return total;

    
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    for (int gift : gifts) {
        maxHeap.add(gift);
    }

    for (int i = 0; i < k; i++) {
        int max = maxHeap.poll();
        maxHeap.add((int) Math.sqrt(max));
    }

    long total = 0;
    while (!maxHeap.isEmpty()) {
        total += maxHeap.poll();
    }

    return total;
    }
}
