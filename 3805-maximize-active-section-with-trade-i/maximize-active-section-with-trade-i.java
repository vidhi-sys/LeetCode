class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1";
        int n = t.length();

        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        List<Character> chars = new ArrayList<>();
        List<Integer> lens = new ArrayList<>();

        int i = 0;
        while (i < n) {
            char ch = t.charAt(i);
            int j = i;

            while (j < n && t.charAt(j) == ch) {
                j++;
            }

            chars.add(ch);
            lens.add(j - i);
            i = j;
        }

        int bestGain = 0;

       
        for (int k = 1; k + 1 < chars.size(); k++) {
            if (chars.get(k) == '1'
                && chars.get(k - 1) == '0'
                && chars.get(k + 1) == '0') {

                int leftZeros = lens.get(k - 1);
                int rightZeros = lens.get(k + 1);

                bestGain = Math.max(bestGain, leftZeros + rightZeros);
            }
        }

        return ones + bestGain;
    }
}