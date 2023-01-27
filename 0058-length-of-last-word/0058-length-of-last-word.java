class Solution {
    public int lengthOfLastWord(String s) {
        String word=s.trim();
        String lastWord = word.substring(word.lastIndexOf(" ")+1);
        return lastWord.length();
        
    }
}