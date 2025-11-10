class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }
              mp.put(ch, mp.get(ch) - 1);
            if (mp.get(ch) < 0) {
                return false; 
            }
        }
        for(int val:mp.values()){
            if(val!=0){
                return false;
            }
        }
        return true;



        
    }
}