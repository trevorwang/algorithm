import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null)
            return -1;
        if (needle == null)
            return -1;
        if (needle.length() == 0)
            return 0;
        int lenTxt = haystack.length();
        int lenPat = needle.length();

        // int[] map = new int[128];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = lenPat - 1; i >= 0; i--) {
            Character c = needle.charAt(i);
            Integer v = map.get(c);
            if (v == null) {
                map.put(c, lenPat - i);
            }
        }

        int idx = 0;
        while (idx < lenTxt && idx + lenPat <= lenTxt) {
            if (haystack.substring(idx, idx + lenPat).equals(needle)) {
                return idx;
            } else {
                int next = idx + lenPat;
                if (next >= lenTxt)
                    return -1;

                Character c = haystack.charAt(next);
                Integer v = map.get(c);
                idx += (v == null ? lenPat : v);
            }

        }
        return -1;
    }
}
// @lc code=end
