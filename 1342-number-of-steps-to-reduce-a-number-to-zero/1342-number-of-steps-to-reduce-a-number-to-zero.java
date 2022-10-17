class Solution {
    public int numberOfSteps(int num) { 
        int counter = 0;
        for(int i = 0 ;  num > 0 ; i++ ){
        if (num % 2 == 0){
            num /=2;
            counter++;
        }else {
            num -=1;
            counter++;
        }

        }
      return counter;

        
    }
}
