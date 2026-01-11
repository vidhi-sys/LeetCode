class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder s2 = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                s2.append(c);
            }
        }

        int i = 0;
        int j = s2.length() - 1;

        while (i < j) {
            if (s2.charAt(i) != s2.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
