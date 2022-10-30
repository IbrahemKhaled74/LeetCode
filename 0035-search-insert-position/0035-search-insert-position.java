class Solution {
    public int searchInsert(int[] nums, int target) {
//         int count=0;
//         for(int i=0 ; i<nums.length ; i++){
//             if(nums[i]==target){
//                 count= i;
//                 break;
//             }else{
//               if(nums[i]>target){
//                 count=i;
//                   break;
//             }else{
//                   count=i+1;
//               }    
//         }
              
//         }
//         return count;
        int low = 0 ;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;

    }
}