class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // track the highest frequency of any character seen in current window
            maxFreq = Math.max(maxFreq, map.get(rightChar));

            // window size - most frequent char count = chars needing replacement
            if ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}