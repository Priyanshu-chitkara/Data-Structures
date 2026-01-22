class Solution {
    public boolean ispal(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }


        }
        return true;
    }
    public void f(List<List<String>> res,List<String> ls,String s,int n,int ind){
        if(ind==n){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=ind;i<n;i++){
            if(ispal(s,ind,i)){
                ls.add(s.substring(ind,i+1));
                f(res,ls,s,n,i+1);
                ls.remove(ls.size()-1);

            }
            
        }

    }
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>> res=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        f(res,ls,s,n,0);
        return res;
        
    }
}