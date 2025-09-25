class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        if(n%3!=0){
            return 0;
        }
        Arrays.sort(piles);
        if(n==3){
            
            return piles[1];
        }
        int i=0;
        int j=n-1;
        int sum=0;
        while(i<j){
            sum+=piles[j-1];
            j=j-2;
            i++;

        }
        return sum;
        
    }
}