class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase();
        StringBuilder word=new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            
         if(s.charAt(i)>=65 && s.charAt(i)<=90 ){
                             word.append( (char) (s.charAt(i)+32) );

         }else {
                word.append(s.charAt(i));
                
            }
        }
        return word+"";
        
    }
}