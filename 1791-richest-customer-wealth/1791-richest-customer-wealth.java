class Solution {
    public int maximumWealth(int[][] accounts) {
        int x=accounts.length;
        int y=accounts[0].length;
        int max=Integer.MIN_VALUE;

       
        for(int i=0;i<x;i++){
            int sum=0;
            for(int j=0;j<y;j++){
                sum+=accounts[i][j];


            }
            max=Math.max(max,sum);
        }
        return max;
        
    }
}