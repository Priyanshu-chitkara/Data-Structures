class Solution {
    public void printF(List<String> st,StringBuilder s,int n,int open,int closed){
          if(open==n && closed==n){
            st.add(s.toString());
        }
         
        if(open<n){
              s.append("(");
            printF(st,s,n,open+1,closed);
            s.deleteCharAt(s.length()-1);
          
            


        }
      
             
       
         
        if(closed<open){
             s.append(")");
             printF(st,s,n,open,closed+1);
             s.deleteCharAt(s.length()-1);
           
            
           
        }
       
             
      
       

    }
    public List<String> generateParenthesis(int n) {
        List<String> st=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        printF(st,s,n,0,0);
        return st;
        
    }
}