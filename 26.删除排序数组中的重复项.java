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
        int p = 0, q = 1;
        for (; q < nums.length; q++) {
            if (nums[p] != nums[q]) {
                p++;
                if (q - p > 0) { // 有重复才会进行数组复制
                    nums[p] = nums[q];
                }
            }
        }
        return p + 1;
    }
}
// @lc code=end
