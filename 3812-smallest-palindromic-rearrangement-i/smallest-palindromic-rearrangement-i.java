class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = '\0';

        // Build left half and find middle character
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }

            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);

        if (middle != '\0') {
            ans.append(middle);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}