import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        // If lengths are different, they can never be close
        if (word1.length() != word2.length()) return false;

        // 1. Map character frequencies (using arrays for speed since it's only lowercase a-z)
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
            set1.add(ch);
        }

        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
            set2.add(ch);
        }

        // Rule 1: Both strings must contain the exact same unique characters
        if (!set1.equals(set2)) return false;

        // Rule 2: The distribution of frequencies must be the same
        // (e.g., one char appears 3 times, another 2, another 1)
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Compare the sorted frequency arrays
        return Arrays.equals(freq1, freq2);
    }
}