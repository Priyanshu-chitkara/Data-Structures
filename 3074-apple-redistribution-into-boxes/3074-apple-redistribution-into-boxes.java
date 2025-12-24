class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int s1=0;
        int n=apple.length;
        int m=capacity.length;
        for(int i=0;i<n;i++){
            s1+=apple[i];
        }
        Arrays.sort(capacity);
        int ans=1;
        int ind=m-1;
        while(ind>=0){
            s1-=capacity[ind];
            if(s1>0){
                ans++;

            }
            

            
            
            ind--;
        }
        return ans;


       
        
    }
}