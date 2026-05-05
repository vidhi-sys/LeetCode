class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char current_char = chars[i];
            int count = 0;

            // count occurrences
            while (i < chars.length && chars[i] == current_char) {
                i++;
                count++;
            }

            // write character
            chars[index++] = current_char;

            // write count if > 1
            if (count > 1) {
                String count_Str = String.valueOf(count);
                for (char ch : count_Str.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
}