/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode reverse_head = reverse(head);

        if (n == 1) {
            reverse_head = reverse_head.next;
            return reverse(reverse_head);
        }

        int i = 0;
        ListNode temp = reverse_head;
        while (temp != null) {
            i++;
            if (i == n - 1) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return reverse(reverse_head);
    }
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode new_head = reverse(head.next);
        ListNode next_node = head.next;
        next_node.next = head;
        head.next = null;
        return new_head;
    }
}