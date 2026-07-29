class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n=rowIndex+1;
        List<List<Integer>> answer = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            answer.add(new ArrayList<>());

            for(int j = 0; j <= i; j++) {

                if(j == 0 || j == i) {
                    answer.get(i).add(1);
                }
                else {
                    int val = answer.get(i-1).get(j-1)
                            + answer.get(i-1).get(j);

                    answer.get(i).add(val);
                }
            }
        }

        return answer.get(rowIndex);
        
    }
}