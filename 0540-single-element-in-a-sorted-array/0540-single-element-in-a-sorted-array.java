class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int key:mp.keySet()){
            if(mp.get(key)==1){
                return key;
            }
        }
        return 1;
        
    }
}