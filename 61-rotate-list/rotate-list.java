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
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int rem = k % n;
        if (k % n == 0) {
            return head;
        }
        head = reverse(head);
        temp = head;
        ListNode prev = temp;
        while (rem > 0) {
            prev = temp;
            rem--;
            temp = temp.next;
        }
        prev.next = null;
        ListNode nextNode = head;
        head = reverse(head);
        nextNode.next = reverse(temp);
        return head;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
        }
        return prev;
    }
}