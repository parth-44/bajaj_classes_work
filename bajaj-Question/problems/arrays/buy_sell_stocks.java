class buy_sell_stocks {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int curr : prices){
            if(curr<minprice){
                minprice = Math.min(minprice,curr);
            }
            else{
                int profit = curr - minprice;
                maxprofit = Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }
}