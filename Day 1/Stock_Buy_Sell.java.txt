class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], result=0;
        for(int i=1;i<prices.length;i++){
           int diff=prices[i]-min;
            min=Math.min(min,prices[i]);
            result=Math.max(result,diff);
        }
        return result;
    }
}