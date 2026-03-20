class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(k!=0){
                sum=sum%k;
            }
            if(mp.containsKey(sum)){
                int index=mp.get(sum);
                if(i-index>=2){
                    return true;

                }
                
            }
            else{
                    mp.put(sum,i);
                }
        }
        return false;
    }
}