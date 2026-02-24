class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));

            }
        }
        while(!st.isEmpty()){
            char ch=st.pop();
            sb.append(ch);
        }
        return sb.reverse().toString();

        
    }
}