class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
       HashMap<Integer,Integer> res=new HashMap<>();

        for(int num:nums){
            res.put(num,res.getOrDefault(num,0)+1);
            
        }
        for(Map.Entry<Integer,Integer> entry:res.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }

        }
        return -1;
        
    }
}