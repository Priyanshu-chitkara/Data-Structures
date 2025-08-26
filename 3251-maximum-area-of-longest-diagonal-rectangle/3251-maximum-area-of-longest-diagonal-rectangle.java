class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        int max_diagonal=Integer.MIN_VALUE;
        int ind=0;
        for(int i=0;i<n;i++){
          int len=dimensions[i][0]*dimensions[i][0];
          int width=dimensions[i][1]*dimensions[i][1];
          int diagonal=len+width;
          if(max_diagonal<diagonal){
            max_diagonal=diagonal;
            ind=i;
          
          
          }
          if(max_diagonal==diagonal && Math.abs(dimensions[i][0]-dimensions[i][1])<Math.abs(dimensions[ind][0]-dimensions[ind][1])){
            ind=i;


          }



          
            
        }
        return dimensions[ind][0]*dimensions[ind][1];
      
      
        
    }
}