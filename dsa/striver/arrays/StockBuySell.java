package Practice.dsa.striver.arrays;

public class StockBuySell {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                ans = Math.max(ans, prices[i] - min);
            }
        }
        return ans;
    }
}
