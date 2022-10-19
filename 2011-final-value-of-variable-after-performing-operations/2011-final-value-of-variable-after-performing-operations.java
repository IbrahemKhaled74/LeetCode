class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int value=0;
        // for (int i= 0 ; i < operations.length ; i++){
        //     if(operations[i]=="--X"|| operations[i]=="X--"){
        //         value--;
        //     }
        //     else {
        //         value++;
        //     }
        // }
        for( String x : operations){
            if(x.contains("++X")|x.contains("X++")){
                value++;
            }else
                value--;
        }
        return value;
        
    }
}