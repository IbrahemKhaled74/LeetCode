class Solution {
    public int[] buildArray(int[] nums) {
        int size=nums.length;
        int [] array =new int[size];
        for(int i = 0 ; i<size ; i++){
            array[i]=nums[nums[i]];
        }
        return array ;
    }
}