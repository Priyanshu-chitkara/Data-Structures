class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        int num=target;


        while(num!=0 &&(num%2==0 || num%2!=0)){

// kabi bhi tera maxdouble khtm to baki bache hai unko terko minus krna pdega unta count utna 
            if(maxDoubles==0){
                count+=num;
                break;
            }

            if(num%2==0 && maxDoubles>0){
                num=num/2;
                count++;
                maxDoubles--;
            }
            else{
                num=num-1;
                count++;
            }
        }
        return count-1;
        
    }
}