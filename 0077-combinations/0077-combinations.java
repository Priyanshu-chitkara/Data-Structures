class Solution {
    public void f(int n,int k,List<List<Integer>> res,List<Integer> ls,int ind){
        if(ind==n){
            if(ls.size()==k){
            res.add(new ArrayList<>(ls));
            
            }
            return;
        }
        ls.add(ind+1);
        f(n,k,res,ls,ind+1);
        ls.remove(ls.size()-1);
        f(n,k,res,ls,ind+1);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        f(n,k,res,ls,0);
        return res;
        
    }
}