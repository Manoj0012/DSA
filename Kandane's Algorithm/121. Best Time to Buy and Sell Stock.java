class Solution {
    public int maxProfit(int[] prices) {
       int sum=prices[0],profit=0;
       for(int i=1;i<prices.length;i++){
        if(sum>prices[i]){
            sum=prices[i];
        }
        else if(prices[i]-sum>profit){
        profit=prices[i]-sum;
        }
       }
        return profit;
    }
}