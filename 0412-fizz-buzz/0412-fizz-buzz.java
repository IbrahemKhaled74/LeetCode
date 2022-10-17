class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> answers = new ArrayList<>(n);
        
        for(int i = 1 ; i <= n ; i++){
         Boolean diviedBy3=i%3==0;
         Boolean diviedBy5=i%5==0;
    
        if(diviedBy3 && diviedBy5){
             answers.add("FizzBuzz");
        }
        else if(diviedBy3 ){
             answers.add("Fizz");
        }
        else if(diviedBy5){
             answers.add("Buzz");
        }else
        {
         answers.add(String.valueOf(i));
        }
        }
    return answers;

    }
}