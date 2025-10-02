class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int exc = 0;
        while(numBottles >= numExchange){
            numBottles -= numExchange;
            numExchange+=1;
            exc+=1;
            numBottles+=1;
        }
        return ans+exc;
        
    }
}
