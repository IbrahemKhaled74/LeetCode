class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int sum=0;
//         int[] result=new int[2];
        
//         for(int i = 0 ; i < nums.length ; i++)
//             for(int j =nums.length-1 ; j > i ; j--){
//                 sum=nums[i]+nums[j];
//                 if(sum==target){
//                     result[0] = i;
//                     result[1] = j;
//                 }
//             }
//         return result;
//-----------------------------------------------------------------------
        //Enhancement solution
        Map<Integer, Integer> result = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(result.containsKey(target-nums[i])){ 
                
                return new int[] {i,result.get(target-nums[i])};
                
            }else{
                result.put(nums[i],i);
            }
        }
        return new int[]{};
        
        
        
    }
}