class Solution {
    public int totalMoney(int n) {
        int money=0;
        int startweek=1;
        while(n>=7){
            for(int i=0;i<7;i++){
                money=money+startweek+i;

            }
            n=n-7;
            startweek++;
            
        }
        for(int k=0;k<n;k++){
            money=money+startweek+k;
        }
        return money;
        
    }
}