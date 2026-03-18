class Solution {
    public int firstUniqueFreq(int[] nums) {
        int n=nums.length;
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
      for(int num:mp.values()){
        mpp.put(num,mpp.getOrDefault(num,0)+1);

      }
      for(int val:nums){
        int freq=mp.get(val);
        if(mpp.get(freq)==1){
            return val;
        }
      }
       
        return -1;
     
        
    }
}