class Solution {
    public void f(List<String> ans,StringBuilder sb,String digits,HashMap<Character,String> mp,int ind){
        if(sb.length()==digits.length()){
            ans.add(new String(sb));
            return;
        }
        String curr=mp.get(digits.charAt(ind));
        for(int i=0;i<curr.length();i++){
            sb.append(curr.charAt(i));
            f(ans,sb,digits,mp,ind+1);
            sb.deleteCharAt(sb.length()-1);
        }



    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        
        HashMap<Character,String> mp=new HashMap<>();
        String[] arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        for(int i=0;i<arr.length;i++){
           char ch=(char)(i+2+'0');
           mp.put(ch,arr[i]);
        }
        StringBuilder sb=new StringBuilder();
        f(ans,sb,digits,mp,0);
        return ans;
 
    }
}