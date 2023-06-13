class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int min=prices[0];
        int maxprofit=0;
        for( i=0;i<prices.length;i++){
        int cost=prices[i]-min;
        maxprofit=Math.max(maxprofit,cost);
        min=Math.min(min,prices[i]);
        }
     return maxprofit;
    }
}
