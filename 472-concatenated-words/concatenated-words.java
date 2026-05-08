import java.util.*;

class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Map<String, Boolean> memo = new HashMap<>();

        for (String word : words) {
            // We use a helper that specifically looks for 2+ words
            if (canForm(word, wordSet, memo)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean canForm(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) return memo.get(word);

        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            if (wordSet.contains(prefix)) {
                String suffix = word.substring(i);
                // The suffix must either be a word in the set 
                // OR be able to be broken down further
                if (wordSet.contains(suffix) || canForm(suffix, wordSet, memo)) {
                    memo.put(word, true);
                    return true;
                }
            }
        }

        memo.put(word, false);
        return false;
    }
}