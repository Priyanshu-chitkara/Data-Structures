class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        // convert arr into string 
        String[] arr=new String[n];
        // storing elements in that string
        for(int i=0;i<n;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        return sb.toString();
        
    }
}