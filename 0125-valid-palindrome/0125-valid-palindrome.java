class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ch=Character.toLowerCase(ch);
                sb.append(ch);
            }

            
        }
        String st=sb.toString();
        String fi=sb.reverse().toString();
        return st.equals(fi);

        
    }
}