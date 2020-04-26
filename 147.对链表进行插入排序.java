
/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode tail = null;
        while (cur != null) {
            if (tail != null && tail.val < cur.val) {
                tail.next = cur;
                tail = cur;
                cur = cur.next;
            } else {

                ListNode next = cur.next;
                while (pre.next != null && pre.next.val < cur.val)
                    pre = pre.next;
                cur.next = pre.next;
                pre.next = cur;
                tail = cur;
                pre = dummy;
                cur = next;
            }
        }

        return dummy.next;
    }
}
// @lc code=end
