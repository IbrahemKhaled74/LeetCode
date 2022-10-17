class Solution {
 public int maximumWealth(int[][] accounts) {
     int  maxWealth=0;
     for(int customer[] : accounts){
         int max = 0 ;
         for (int bank : customer){
             max+=bank;
          maxWealth=Math.max(maxWealth, max);
        
         }
     }
     return maxWealth;
        
    }

}