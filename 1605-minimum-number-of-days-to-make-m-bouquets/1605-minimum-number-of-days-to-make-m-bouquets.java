class Solution {
    public static int minimum(int [] bloomday){
        int n=bloomday.length;
        int min=bloomday[0];
        for(int i=1;i<n;i++){
            if(min>bloomday[i]){
                min=bloomday[i];
            }
        }
        return min;
    }
    public static int maximum(int [] bloomday){
        int n=bloomday.length;
        int max=bloomday[0];
        for(int i=1;i<n;i++){
            if(max<bloomday[i]){
                max=bloomday[i];
            }
        }
        return max;
    }
    public static int isPossible(int [] arr,int day,int target){
        int count=0;
        int nob=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                nob+=(count/target);
                count=0;
            }
        }
        nob+=(count/target);
        return nob;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int s=minimum(bloomDay);
        int e=maximum(bloomDay);
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int numberofBouquets=isPossible(bloomDay,mid,k);
            if(numberofBouquets>=m){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
        
    }
}