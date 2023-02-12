class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter=0;
        for(String i :words ){
        Boolean isConsistent=true;

            for(char j : i.toCharArray()){
                if(!allowed.contains(j+"")){
                 isConsistent= false;
                }
            }
            if(isConsistent==true)counter++;

        }
        return counter;
        
    }
}