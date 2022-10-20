class Solution {
    public int findMaxK(int[] nums) {
        int largeNumber=nums[0];

        for(int a:nums){
            if(a!=-largeNumber){
                largeNumber=-1;
            }
        }
        for(int x :nums){
            for(int y :nums){
                if(x==-y){
                    if(y>largeNumber){
                        largeNumber=y;
                    }
                }
            }
        }
    
        return largeNumber;
        
    }
}