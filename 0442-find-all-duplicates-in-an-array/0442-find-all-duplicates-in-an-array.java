class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        int [] freq=new int [10000000];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=0; i<10000000; i++){
            if(freq[i]==2){
                res.add(i);  
                         
            }
        }
        return res;
        
    }
}