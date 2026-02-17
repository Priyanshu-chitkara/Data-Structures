class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int n=prices.length;
        int cp=prices[0];
        for(int i=1;i<n;i++){
            cp=Math.min(cp,prices[i]);
            maxprofit=Math.max(maxprofit,Math.abs(prices[i]-cp));
            
        }
        return maxprofit;
        
    }
}