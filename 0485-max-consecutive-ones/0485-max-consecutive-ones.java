class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count+=1;
            }
            if(arr[i]==0){
                ans=Math.max(count,ans);
                count=0;
            }


            

        }
        ans=Math.max(count,ans);
        return ans;
    }
}