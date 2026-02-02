class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        }
        for(int key:mp.keySet()){
            if(mp.get(key)>n/3){
                ls.add(key);
                
            }
        }
        return ls;
        
    }
}