class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int profit=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] > low){
                profit= Math.max((prices[i]-low), profit);
            }
            else{
                low=prices[i];
            }
        }
        return profit;
    }
}