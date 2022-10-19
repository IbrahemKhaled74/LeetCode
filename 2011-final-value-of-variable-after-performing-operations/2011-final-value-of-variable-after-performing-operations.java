class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int value=0;
        for( String x : operations){
            if(x.contains("++X")|x.contains("X++")){
                value++;
            }else
                value--;
        }
        return value;
        
    }
}