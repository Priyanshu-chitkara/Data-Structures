class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<m;i++){
            char c=magazine.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=ransomNote.charAt(i);
            if(!mp.containsKey(ch) || mp.get(ch)==0){
                return false;
            }
            mp.put(ch,mp.get(ch)-1);
           
        }
        return true;
      
        
    }
}