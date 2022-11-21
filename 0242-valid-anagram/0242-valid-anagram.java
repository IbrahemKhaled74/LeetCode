class Solution {
    public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length())return false;
//     char[] sSorted = s.toCharArray();
//     Arrays.sort(sSorted);
        
//     char[] tSorted = t.toCharArray();
//     Arrays.sort(tSorted);
        
//         for (int i = 0; i < s.length(); i++)
//             if (sSorted[i] != tSorted[i])
//                 return false;
// return true;
        
        if(s.length()!=t.length())return false;
        int []counter=new int[26];
        for(int i=0 ; i <s.length() ; i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int i : counter){
            if(i!=0){
                return false;
            }
        }
        return true;
        
        
   
        
    }
}