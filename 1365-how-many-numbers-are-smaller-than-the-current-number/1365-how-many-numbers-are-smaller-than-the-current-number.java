class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]count = new int[nums.length];
        List<Integer> temp = new ArrayList<Integer>();
        for(int n : nums){
            temp.add(n);   
        }
        Collections.sort(temp);
        for(int i = 0 ; i<nums.length ; i++){
            count[i]=temp.indexOf(nums[i]);
            
        }
        return count;
        
    }
}