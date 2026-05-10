class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int curr_price=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<curr_price){
                curr_price=prices[i];
            }
            else{
                int curr_profit=prices[i]-curr_price;
                profit=Math.max(curr_profit,profit);
            }

        }
        return profit;
    }
}