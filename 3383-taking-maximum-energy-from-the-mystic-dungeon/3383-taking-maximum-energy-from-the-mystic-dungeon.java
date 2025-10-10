// class Solution {
//     public int maximumEnergy(int[] energy, int k) {
//         int n=energy.length;
//         int energi=Integer.MIN_VALUE;
//         for(int i=1;i<=k;i++){
//             int sum=0;
//             for(int j=n-i;j>=0;j-=k){
//                 energy[i]+=sum;
//                 sum=energy[i];
                
//               if(energy[i]>energi) energi=energy[i];
              

//             }

//         }
//         return energi;


        
//     }
// }
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maximum = Integer.MIN_VALUE;
        for(int x=1;x<=k;x++){
            int sum =0;
            for(int i=n-x;i>=0;i-=k){
                 energy[i]+=sum;
                 sum=energy[i];
                 if(energy[i]>maximum) maximum =energy[i];
            }
        }
        
        // for(int en : energy){
        //     if(en>maximum) maximum =en;
        // }
        return maximum;
    }
}