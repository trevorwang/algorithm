/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int p = 0;
        for (int q = 1; q < nums.length; q++) {
            if (nums[p] != nums[q]) {
                p++;
                if (q > p) {
                    nums[p] = nums[q];
                }
            }
        }
        return p + 1;
    }
}
// @lc code=end
