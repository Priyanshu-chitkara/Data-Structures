class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int ele:nums){
            xor=xor^ele;
        }
        int pos=0;
        for(int i=0;i<32;i++){
            if(((xor>>i)&1)==1){
                pos=i;
                break;
            }
        }
        int a=0;
        int b=0;
        for(int ele:nums){
            if(((ele>>pos)&1)==1){
                a=a^ele;
            }
            else{
                b=b^ele;
            }
        }
        return new int[]{a,b};
        
    }
}