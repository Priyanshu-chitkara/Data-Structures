class Solution {
    public void f(List<List<String>> res,List<String> ls,String s,int ind){
        if(ind==s.length()){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(ispall(s,ind,i)){
                ls.add(s.substring(ind,i+1));
                f(res,ls,s,i+1);
                ls.remove(ls.size()-1);

            }
        }
        
    }
    public boolean ispall(String s,int start,int end){
        while(start<=end){
           if(s.charAt(start++)!=s.charAt(end--)){
            return false;
           }
          
        }
         return true;

    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        f(res,ls,s,0);
        return res;
        
    }
}