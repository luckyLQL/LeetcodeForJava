import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        Set<Character> childString = new TreeSet<>();
        int setSize = 0;
        for (int i = 0; i < s.length(); i++) {
            childString.clear();
            childString.add(s.charAt(i));
            setSize = childString.size();
            for (int j = i+1; j < s.length(); j++) {
                childString.add(s.charAt(j));
                if (childString.size() != setSize) {
                    setSize = childString.size();
                } else {
                    break;
                }
            }
            if (setSize >= longestLength) {
                longestLength = setSize;
            }

        }

        return longestLength;

    }

    public int lengthOfLongestSubstring_2(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0, j=0; i< s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }

            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
