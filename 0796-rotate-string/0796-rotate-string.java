class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String curr=s;
        int n=s.length();
        for(int i=0;i<n;i++){
            curr=curr.substring(1)+curr.charAt(0);
            if(curr.equals(goal)){
                return true;
            }
        }
        return false;

        
    }
}