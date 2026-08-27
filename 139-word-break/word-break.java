import java.util.*;

class Node {
    Node[] daughter;
    boolean eow;

    Node() {
        daughter = new Node[26];
        eow = false;
    }

    public void insert(String s) {
        Node curr = this;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (curr.daughter[idx] == null) {
                curr.daughter[idx] = new Node();
            }

            curr = curr.daughter[idx];
        }

        curr.eow = true;
    }
}

class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        Node root = new Node();

        for (String word : wordDict) {
            root.insert(word);
        }

        Boolean[] memo = new Boolean[s.length()];

        return solve(s, 0, root, memo);
    }

    public boolean solve(String s, int start, Node root, Boolean[] memo) {

        if (start == s.length()) {
            return true;
        }

        if (memo[start] != null) {
            return memo[start];
        }

        Node curr = root;

        for (int i = start; i < s.length(); i++) {

            int idx = s.charAt(i) - 'a';

            if (curr.daughter[idx] == null) {
                break;
            }

            curr = curr.daughter[idx];

            if (curr.eow) {

                if (solve(s, i + 1, root, memo)) {
                    return memo[start] = true;
                }
            }
        }

        return memo[start] = false;
    }
}