/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个有序数组的中位数
 *
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
 *
 * algorithms
 * Hard (37.11%)
 * Likes:    2329
 * Dislikes: 0
 * Total Accepted:    162K
 * Total Submissions: 435.9K
 * Testcase Example:  '[1,3]\n[2]'
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 
 * 示例 1:
 * 
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * 则中位数是 2.0
 * 
 * 
 * 示例 2:
 * 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 
 * 则中位数是 (2 + 3)/2 = 2.5
 * 
 * 
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1); // 保证 m <= n
        }
        int imin = 0;
        int imax = m;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = (m + n + 1) / 2 - i; // 保证奇数时，中位数在左边

            if (j != 0 && i != m && nums2[j - 1] > nums1[i]) {
                imin = i + 1;
            } else if (i != 0 && j != n && nums1[i - 1] > nums2[j]) {
                imax = i - 1;
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums2[j - 1], nums1[i - 1]);
                }
                if ((m + n) % 2 == 1)
                    return maxLeft;

                int minRight = 0;

                if (j == n) {
                    minRight = nums1[i];
                } else if (i == m) {
                    minRight = nums2[j];
                } else {
                    minRight = Math.min(nums2[j], nums1[i]);
                }
                return (minRight + maxLeft) / 2.0;
            }

        }

        return 0.0;
    }
}
// @lc code=end
