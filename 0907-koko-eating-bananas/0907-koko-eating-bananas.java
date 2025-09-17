class Solution {
    public int max(int[] piles){
        int x=piles[0];
        for(int i=0;i<piles.length;i++){
            if(x<piles[i]){
                x=piles[i];
            }

        }
        return x;

    }
    public int func(int [] piles,int hourly){
        int totalTime=0;
        for(int i=0; i<piles.length; i++){
            totalTime+=Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalTime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=max(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int total_hours=func(piles,mid);
            if(total_hours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
       
        
    }
}