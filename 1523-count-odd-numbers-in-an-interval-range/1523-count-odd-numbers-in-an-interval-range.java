class Solution {
    public int countOdds(int low, int high) {
        
        int dig=high-low+1;
        if(dig%2!=0){
            if(low%2!=0 && high%2!=0){
                int ans=(dig/2)+1;
                return ans;

            }
            else{
                int ans=(dig/2);
                return ans;
            }
            


        }
    int rans=dig/2;
    return rans;
        

      
        
    }
}