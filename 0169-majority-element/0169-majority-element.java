class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       for(int k:mp.keySet()){
        if(mp.get(k)>n/2){
            return k;
        }

       }
       return -1;
   
        
    }
}