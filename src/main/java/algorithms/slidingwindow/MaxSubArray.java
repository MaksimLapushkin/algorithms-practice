package algorithms.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class MaxSubArray {

    public int lengthOfLongestSubstring(String str) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < str.length(); right++) {
            char current = str.charAt(right);

            while (window.contains(current)) {
                window.remove(str.charAt(left));
                left++;
            }

            window.add(current);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}