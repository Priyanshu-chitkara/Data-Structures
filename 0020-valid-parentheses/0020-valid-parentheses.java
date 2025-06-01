class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();  // Stack to store opening brackets
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            // If it's a closing bracket
            else {
                if (st.isEmpty()) return false;  // No matching opening bracket
                char top = st.pop();             // Get last opened bracket

                // Check if the current closing bracket matches the opening one
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;  // Mismatched brackets
                }
            }
        }
        
        // If stack is empty, all brackets matched correctly
        return st.isEmpty();
    }
}
