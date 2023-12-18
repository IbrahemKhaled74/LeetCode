class Solution {
    public int[] replaceElements(int[] arr) {
//         int size=arr.length;
//         for(int i=0 ; i < size-1 ; i++){
//             int max=0;
//             for(int j=i+1 ; j < size ; j++){
//                 max = Math.max(max,arr[j]);        
//             }
//             arr[i]=max;
//         }
//         arr[size-1]=-1;

//         return arr;
//-----------------------------------------------------------------
        //Enhancment solution
        int max= -1 ;

        for(int i=arr.length-1 ; i >= 0 ; i--){
            if(arr[i] > max){
                int temp =max;
                max = arr[i];
                arr[i]=temp;
            }else{
                arr[i]=max;
            }            
            
            
        }
            return arr;

        
        
    }
}