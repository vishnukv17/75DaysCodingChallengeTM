class Solution {
    public int maxProfit(int[] prices) {
        
        int buy=prices[0];
        int sell=0;
        int i=1;
        int profit=0;
        while(i<prices.length){
            
            if(prices[i]<buy && sell==0){
                buy=prices[i];
                
            }
            else{
                if(sell>prices[i]){
                    profit+=sell-buy;
                    buy=prices[i];
                    sell=0;
                  
                }
                else{
                    sell=prices[i];
                    if(i==prices.length-1){  
                         profit+=sell-buy;
                    }
                    
                   
                }
                
            }
            i++;
        }
        
        return profit;
        
        
    }
}