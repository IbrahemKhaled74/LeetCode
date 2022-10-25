class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for (String n :sentences ){
            if(n.split(" ").length>max){
                max=n.split(" ").length;
            }
            
        }
        return max;
        
    }
}