class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int even_sum=0;
        int odd_sum=0;
        for(int i=0;i<n;i++){
            int ch=num.charAt(i)-'0';
            if(i%2==0){
                even_sum+=ch;


            }else{
                odd_sum+=ch;


            }
            
        

        }
        if(even_sum==odd_sum){
                return true;
            }
        return false;
        
    }
}