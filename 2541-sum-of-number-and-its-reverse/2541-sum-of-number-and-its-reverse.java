class Solution {
    public int reverse(int i){
        int rev=0;
        while(i>0){
             int ld=i%10;
             rev=rev*10+ld;
             i=i/10;

        }
       return rev;
       



    }
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        for(int i=1;i<=num;i++){
            int rev=reverse(i);
            if(i+rev==num){
                return true;
            }
        }
        return false;
        
    }
    
}
