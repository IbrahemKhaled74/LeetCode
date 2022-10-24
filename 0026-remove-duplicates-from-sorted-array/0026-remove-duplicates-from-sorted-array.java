class Solution {
    public int removeDuplicates(int[] nums) {
        int number=1;
        for(int i : nums ){
            if(i> nums[number-1]){
                nums[number]=i;
                 number++;

            }
        }
        return number;
        
        
    }
}