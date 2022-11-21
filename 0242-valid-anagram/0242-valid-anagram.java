class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
    char[] sSorted = s.toCharArray();
    Arrays.sort(sSorted);
        
    char[] tSorted = t.toCharArray();
    Arrays.sort(tSorted);
        
        for (int i = 0; i < s.length(); i++)
            if (sSorted[i] != tSorted[i])
                return false;
return true;
    
   
        
    }
}