class Solution {
    public int numUniqueEmails(String[] emails) {
        Set setEmails = new HashSet();
        
        for(String email : emails){
            int atSign = email.indexOf("@");
            int plusSign = email.indexOf("+");
            String newEmail="";
            if(plusSign >= 0){
                newEmail = email.substring(0,plusSign);
            }else{
                newEmail = email.substring(0,atSign);
            }
            newEmail = newEmail.replace(".","") + email.substring(atSign);
            setEmails.add(newEmail);
            
        }
        return setEmails.size();
        
    }
}