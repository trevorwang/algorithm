/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int p = 0, q = 0;
        while (q < nums.length) {
            if (nums[q] != val) {
                nums[p++] = nums[q];
            }
            q++;
        }
        return p;
    }
}
// @lc code=end
