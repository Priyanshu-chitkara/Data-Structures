class Solution {
    public int buyChoco(int[] prices, int money) {
       int n=prices.length;
     
      Arrays.sort(prices);
      if((prices[0]+prices[1])>money){
        return money;
      }

     

       

      int count=1;
      
        for(int i=0;i<n;i++){
            if(prices[i]<=money && count<=2){
                money=money-prices[i];
                if(money<=0){
                    return 0;
                }
                
            }
            count++;
        }
      
       
       return money;
    }
}