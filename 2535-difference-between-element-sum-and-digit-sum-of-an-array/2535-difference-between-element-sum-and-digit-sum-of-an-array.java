class Solution {
    public int differenceOfSum(int[] nums) {
        int elmentSum=0;
        int digitSum=0;
        for(int i = 0 ; i< nums.length ; i++ ){
            elmentSum+=nums[i];
            if(nums[i]>=10){
            while(nums[i]!=0){
                digitSum+=nums[i]%10;
                nums[i]/=10;
            }  

            
        }else{
         digitSum+=nums[i]; 
            }
        
        }
          return elmentSum-digitSum;

    }
}
