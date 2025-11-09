class Solution {
    public int numberOfSteps(int num) {
        int cur_num=num;
        int count=0;
       while(cur_num!=0 && (cur_num%2==0 || cur_num%2!=0)){
        if(cur_num%2==0){
            cur_num=cur_num/2;
            count++;
        }
        else if(cur_num==0){
            break;
        }
        else{
            cur_num=cur_num-1;
            count++;
        }


       }
       return count;
        
    }
}