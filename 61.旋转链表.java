/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        int carry = k % len;
        if (carry == 0)
            return head;
        ListNode pre = head;
        for (int i = 0; i < len - carry - 1; i++) {
            pre = pre.next;
        }
        ListNode res = pre.next;
        pre.next = null;
        tail.next = head;
        return res;

    }
}
// @lc code=end
