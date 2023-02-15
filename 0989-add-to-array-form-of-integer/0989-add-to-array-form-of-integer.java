class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> numbers=new ArrayList<Integer>();
        int sum=0;
        for(int i = num.length-1 ; i>=0 ; i--){
            sum= num[i] + k;
            numbers.add(sum % 10);
            k = sum/ 10;
        }
        while(k>0){
            numbers.add(k%10);
            k/=10;
        }
        //reverse list
        Collections.reverse(numbers);
        
        return numbers ;
        
    }
}