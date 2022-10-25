class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for (String n :sentences ){
            
            if(n.split(" ").length>count){
                count=n.split(" ").length;
            }
            
        }
        return count;
        
    }
}