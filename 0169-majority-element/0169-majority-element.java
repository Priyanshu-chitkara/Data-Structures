class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(var it:mp.keySet()){
            if(mp.get(it)>n/2){
                return it;
                
            }
        }
        return 0;
        
    }
}