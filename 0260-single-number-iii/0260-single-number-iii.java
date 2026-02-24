class Solution {
    public int[] singleNumber(int[] nums) {
        int [] ans=new int[2];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        for(int key:mp.keySet()){
            if(mp.get(key)!=2 && i<2){
                ans[i]=key;
                i++;

            }
        }
        return ans;
        
    }
}