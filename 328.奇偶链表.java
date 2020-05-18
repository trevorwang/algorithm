/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode p = head.next;
        int index = 1;
        while (p != null && p.next != null) {

            p = p.next;
            index += 2;
        }

        return head;

    }
}
// @lc code=end
