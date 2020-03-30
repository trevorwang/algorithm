import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 *
 * algorithms
 * Medium (33.39%)
 * Likes:    3309
 * Dislikes: 0
 * Total Accepted:    391.1K
 * Total Submissions: 1.2M
 * Testcase Example:  '"abcabcbb"'
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * 示例 1:
 * 
 * 输入: "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 
 * 
 * 示例 2:
 * 
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 
 * 
 * 示例 3:
 * 
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 
 * 
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {

        // int max = 0, i = 0, j = 0;
        // int len = s.length();
        // Set<Character> set = new HashSet<>();
        // while (i < len && j < len) {
        // if (!set.contains(s.charAt(j))) {
        // set.add(s.charAt(j++));
        // max = Math.max(max, j - i);
        // } else {
        // set.remove(s.charAt(i++));
        // }
        // }
        // return max;

        int ans = 0;
        int[] array = new int[256];

        for (int i = 0, j = 0; j < s.length(); j++) {
            i = Math.max(array[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            array[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
// @lc code=end
