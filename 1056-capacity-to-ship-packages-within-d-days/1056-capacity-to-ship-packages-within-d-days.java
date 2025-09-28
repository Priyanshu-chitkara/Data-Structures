class Solution {
    public int max(int []weights){
        int n=weights.length;
        int x=weights[0];
        for(int i=1;i<n;i++){
            if(x<weights[i]){
                x=weights[i];
            }
        }
        return x;

    }
    public int sum(int [] weights){
        int n=weights.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        return sum;
    }
    public int days(int []weights,int days,int max){
        int load=0;
        int lday=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>max){
                lday+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return lday;

    }
    public int shipWithinDays(int[] weights, int days) {
        int max=max(weights);
        int sum=sum(weights);
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int ndays=days(weights,days,mid);
            if(ndays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
        
    }
}