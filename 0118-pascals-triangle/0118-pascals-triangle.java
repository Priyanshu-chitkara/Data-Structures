class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ls=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ls.add(1);
                }
                else{
                    ls.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(ls);
        }
        return res;
        
    }
}