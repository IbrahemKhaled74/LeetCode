class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] array = new int[2*n];
        array[0]=nums[0];
        int j=2;
        int y=n;
        for(int  i = 1 ; i < n ; i++){
            array[j]=nums[i];
            j+=2;

        }
     for(int  i = 1 ; i <= 2*n-1 ; i+=2){
            array[i]=nums[y];
            y++;

        }
        return array;
        
    }
}