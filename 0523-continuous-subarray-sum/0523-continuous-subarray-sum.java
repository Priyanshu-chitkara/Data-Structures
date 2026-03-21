class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int s=0;
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            s+=nums[i];
            if(mp.containsKey(s%k)){
                int ind=mp.get(s%k);
                if(i-ind>=2){
                    return true;
                }


            }
            else{
            mp.put(s%k,i);
            }
        }
        return false;
        
    }
}