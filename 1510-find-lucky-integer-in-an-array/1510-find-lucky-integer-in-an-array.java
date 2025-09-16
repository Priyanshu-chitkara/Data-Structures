class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int freq[]=new int[501];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;  
        }
        int ans=-1;
        for(int i=1;i<501;i++){
            if(freq[i]==i){
                ans=Math.max(ans,freq[i]);
            }
        }
        return ans;
        
        
    }
}