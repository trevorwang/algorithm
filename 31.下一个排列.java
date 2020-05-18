/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2)
            return;

        int n = nums.length;

        for (int i = n - 1; i >= 1; i--) {
            int j = i - 1;
            if (nums[j] < nums[i]) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                return;
            }
        }

        int j = (n + 1) / 2;
        for (int i = 0; i < j; i++) {
            int tmp = nums[i];
            nums[i] = nums[n - i];
            nums[n - i] = tmp;
        }
    }
}
// @lc code=end
