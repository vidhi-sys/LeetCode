class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();
        int k = p.length();
        int i = 0, j = 0;

        while (j < s.length()) {

            char endChar = s.charAt(j);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {

                if (count == 0) {
                    ans.add(i);
                }

                char startChar = s.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) == 1) {
                        count++;
                    }
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}