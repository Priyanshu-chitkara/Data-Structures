class Solution {
    public void printF(int [] nums,int ind,List<Integer> cur,List<List<Integer>> res){
        int n=nums.length;
        if(ind==n){
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[ind]);
        printF(nums,ind+1,cur,res);
        cur.remove(cur.size()-1);
        printF(nums,ind+1,cur,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        printF(nums,0,cur,res);
        return res;
        
    }
}