class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int caps = 0;

        // Count all uppercase characters
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                caps++;
            }
        }

        // Case 1: All letters are capitals (USA)
        if (caps == n) return true;

        // Case 2: No letters are capitals (leetcode)
        if (caps == 0) return true;

        // Case 3: Only one capital, and it must be the first letter (Google)
        if (caps == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}