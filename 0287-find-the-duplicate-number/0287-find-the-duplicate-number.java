class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int k:mp.keySet()){
            if(mp.get(k)>1){
                ans=k;
            }

        }
        return ans;
        
    }
}