class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        if(n==k){
            return "0";
        }
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;

            }
            st.push(ch);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        for(char c:st){
            sb.append(c);

        }
        
        
        
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        
        String ans=sb.toString();
        return ans;

        
    }
}