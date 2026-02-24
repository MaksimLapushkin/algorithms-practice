package algorithms.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {

    /**
     * Returns index of the first non-repeating character in the string.
     * If there is no such character, returns -1.
     *
     * Time: O(n)
     * Space: O(k) where k is number of distinct chars
     */
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}