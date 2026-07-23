class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++; // matched a character of t
            }
            i++; // always move in s
        }

        // characters left in t need to be appended
        return t.length() - j;
    }
}