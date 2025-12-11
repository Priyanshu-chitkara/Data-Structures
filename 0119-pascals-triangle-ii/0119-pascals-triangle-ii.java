class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> res=new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    res.add(1);
                }
                else{
                    res.add(ls.get(i-1).get(j-1)+ls.get(i-1).get(j));

                }
            }
            ls.add(res);
        }
    return ls.get(rowIndex);
    
        
    }
}