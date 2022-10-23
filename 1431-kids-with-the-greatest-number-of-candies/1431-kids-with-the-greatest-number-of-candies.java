class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest=0;
        List<Boolean> great=new ArrayList<Boolean>();
        for(int j=0 ; j < candies.length ; j++){
            if(candies[j]>greatest){
                greatest=candies[j];
            }
        }
            
            
            
            
        for (int i =0 ; i <candies.length ; i++ ){
            if(candies[i]+extraCandies >= greatest){
                great.add(true);
            }else
            great.add(false);

        }
        
        return great;
    }
}