class Solution {
    public int minimum(int[] arr){
        int n=arr.length;
        int x=arr[0];
        for(int i=1;i<n;i++){
            if(x>arr[i]){
                x=arr[i];
            }
        }
        return x;

    }
    public int maximum(int [] arr){
          int n=arr.length;
          int y=arr[0];
        for(int i=1;i<n;i++){
            if(y<arr[i]){
                y=arr[i];
            }
        }
        return y;


    }
    public int possible(int[] arr,int bq,int days){
        int n=arr.length;
        int count=0;
        int b=0;

        for(int i=0;i<n;i++){
            if(days>=arr[i]){
                count++;
            }
            else{
                b+=(count/bq);
                count=0;

            }
            
            

        }
        b+=(count/bq);
        return b;

    }

    public int minDays(int[] bloomDay, int m, int k) {
        int x=minimum(bloomDay);
        int y=maximum(bloomDay);
        int low=x;
        int high=y;
        int ans=-1;
        while(low<=high){
            int days=(low+high)/2;
            int nob=possible(bloomDay,k,days);
            if(nob>=m){
                ans=days;
                high=days-1;

            }
            else{
                low=days+1;
            }


        }
        return ans;

        
    }
}