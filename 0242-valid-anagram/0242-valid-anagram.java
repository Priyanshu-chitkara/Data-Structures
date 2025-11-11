class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
         if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<m;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            if(!mp.containsKey(t.charAt(i))){
                return false;
            }
            mp.put(t.charAt(i), mp.get(t.charAt(i)) - 1);
            if (mp.get(t.charAt(i)) < 0) {
                return false;
        }
        }
        for(int i:mp.values()){
            if(i!=0){
                return false;
            }
        }
        
        
    
    return true;
}
}