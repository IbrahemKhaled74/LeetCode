class Solution {
    public String sortSentence(String s) {
        String [] words=s.split(" ");
	    String[] res = new String[words.length]; 
        StringBuilder sentence= new StringBuilder();
        int index=0;
        for(String i : words){   
            index = Integer.valueOf(i.substring(i.length()-1)) ;
            res[index-1]= i.substring(0 , i.length()-1) ;
            
        }
        for(int i=0 ; i <res.length ; i++ ){
            if(i==res.length-1){sentence.append(res[i]);}
            else{ sentence.append(res[i]+" ");}
        }
        
      return sentence+"";
    }
}