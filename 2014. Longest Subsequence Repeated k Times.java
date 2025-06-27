import java.util.*;

class Solution {
    public boolean appearsKTimes(String sub, String s, int k) {
        int index = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == sub.charAt(index)) {
                index++;
                if (index == sub.length()) {
                    count++;
                    index = 0;
                    if (count == k) return true;
                }
            }
        }

        return false;
    }

    public String longestSubsequenceRepeatedK(String s, int k) {
        String result = "";
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            for (char ch = 'a'; ch <= 'z'; ch++) {
                String next = curr + ch;

                if (appearsKTimes(next, s, k)) {
                    result = next;
                    queue.add(next);
                }
            }
        }

        return result;
    }
}
