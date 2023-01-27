class Solution {
    public int lengthOfLastWord(String s) {
        // String word=s.trim();
        // String lastWord = word.substring(word.lastIndexOf(" ")+1);
        // return lastWord.length();
        int length = 0 ;
        String word=s.trim();

        for(int  i = 0 ; i<word.length() ; i++){
            if(word.charAt(i) !=' '){
                length++;
            }else{
                length=0;
            }
        }
        return length;
        
    }
}