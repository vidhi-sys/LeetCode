class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();

        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        String str = sb.toString();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
