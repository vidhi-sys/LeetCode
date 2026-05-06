class Solution {
    public boolean detectCapitalUse(String word) {
        // Case 1: All caps
        if (word.equals(word.toUpperCase())) return true;
        
        // Case 2: All lowercase
        if (word.equals(word.toLowerCase())) return true;
        
        // Case 3: Title Case (First letter cap, rest lower)
        // We check if the first char is upper AND the rest is lower
        String firstChar = word.substring(0, 1);
        String rest = word.substring(1);
        
        if (firstChar.equals(firstChar.toUpperCase()) && 
            rest.equals(rest.toLowerCase())) {
            return true;
        }
        
        return false;
    }
}