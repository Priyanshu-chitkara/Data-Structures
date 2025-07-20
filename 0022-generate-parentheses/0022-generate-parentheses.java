class Solution {
    public void printS(int n,List<String> res,int open,int closed,StringBuilder sb){
        if(open==n && closed==n){
            res.add(sb.toString());
            return;

        }
        if(open<n){
            sb.append("(");
            printS(n,res,open+1,closed,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(closed<open){
            sb.append(")");
            printS(n,res,open,closed+1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        printS(n,res,0,0,sb);
        return res;
        
    }
}