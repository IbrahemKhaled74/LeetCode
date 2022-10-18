class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] doubleArray = new int[(nums.length)*2];
        int counter=0;
            for(int i = 0 ; i <nums.length ; i++){
               doubleArray[i]=nums[i] ;
                counter++;

            }
             for(int i = 0 ; i <nums.length ; i++){
               doubleArray[counter]=nums[i] ;
                 counter++;
            }
        
        return doubleArray;
        
    }
}