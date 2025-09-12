class Solution {
    public boolean canWinNim(int n) {
        for(int i=1;i<4;i++){
            if(n==i){
                return true;
            }
        }
        if(n%4!=0){
            return true;
        }

       
        else{
            return false;
        }
        
        
        
    }
}