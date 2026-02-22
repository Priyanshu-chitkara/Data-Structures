class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));


            }
        }
        String ans=sb.toString();
        String rans=sb.reverse().toString();
        return ans.equals(rans);
        

        
    }
}