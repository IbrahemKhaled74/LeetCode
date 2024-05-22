class Solution {
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        if(s.length() < 1)return true;
        
        for(int i = 0 ; i < t.length() && counter < s.length() ; i++){
            if (s.charAt(counter) == t.charAt(i)) counter++;    
        }
        return counter == s.length();
        
        
    }
}