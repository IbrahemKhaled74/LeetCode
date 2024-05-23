class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        for(int i = 1 ; i < numRows ; i++){
            //add 1 in every row at beginning 
            List<Integer> row = new ArrayList<>();
            //prev here to get last array to made sum on it
            List<Integer> prev =result.get(i-1);
            row.add(1);
            for(int j = 1 ; j < i ;j++){
                //fill the array except the final one
                int sum = prev.get(j) + prev.get(j-1);
                row.add(sum);
            }
            //add 1 in row at the end
            row.add(1);
            result.add(row);
        }
        return result;
        
    }
}