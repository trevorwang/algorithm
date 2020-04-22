/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String ss = countAndSay(n - 1);
        Character c = null;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length(); i++) {
            Character d = ss.charAt(i);
            if (c == d) {
                count++;
            } else {
                if (c != null) {
                    sb.append(count).append(c);
                }
                c = d;
                count = 1;
            }
            if (i == ss.length() - 1) {
                sb.append(count).append(c);
            }
        }
        return sb.toString();
    }
}
// @lc code=end
