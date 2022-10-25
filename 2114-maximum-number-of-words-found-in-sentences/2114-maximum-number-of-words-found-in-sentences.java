class Solution {
    public int mostWordsFound(String[] sentences) {
        String [] words=new String[sentences.length];
        int count=0;
        for (String n :sentences ){
            words=n.split(" ");
            if(words.length>count){
                count=words.length;
            }
            
        }
        return count;
        
    }
}