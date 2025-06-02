class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
            st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    count++;
                }
                else{
                st.pop();
                }
                
                
            }

        }
        return count+st.size();

        
    }
}