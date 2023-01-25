class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String words1="";
        String words2="";
        for(String i :word1){
            words1+=i;
        }
         for(String i :word2){
            words2+=i;
        }
         if(words1.equals(words2)) return true;
             return false;
        
    }
}