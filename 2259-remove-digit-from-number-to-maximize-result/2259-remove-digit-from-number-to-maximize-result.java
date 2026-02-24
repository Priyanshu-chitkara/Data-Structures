class Solution {
    public String removeDigit(String number, char digit) {
        int n=number.length();
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(number.charAt(i)==digit && cnt<1){
                if(i<n-1 && number.charAt(i)<number.charAt(i+1)){

                    cnt++;
                     continue;
              
                    

                }
               
                 
                
            }
            
            sb.append(number.charAt(i));
            

        }
         if (cnt == 0) {
            int last = sb.lastIndexOf(String.valueOf(digit));
            
            sb.deleteCharAt(last);
        }
        return sb.toString();


    }
}