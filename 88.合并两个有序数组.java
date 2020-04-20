/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m > 0 || n > 0) {
            int p1 = m > 0 ? nums1[m - 1] : Integer.MIN_VALUE;
            int p2 = n > 0 ? nums2[n - 1] : Integer.MIN_VALUE;
            if (p1 >= p2) {
                nums1[m + n - 1] = p1;
                m--;
            } else {
                nums1[m + n - 1] = p2;
                n--;
            }
        }
    }
}
// @lc code=end
