class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> answer = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

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

        return answer;
    }
}