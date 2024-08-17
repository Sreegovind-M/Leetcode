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
        ListNode reverseHead = reverse(head);
        ListNode temp = reverseHead;
        int x = 1;

        if (n == 1){
            temp = reverseHead.next;
            reverseHead = temp;
            return reverse(reverseHead);
        }

        while (temp != null && temp.next != null ){
            if (n - 1 == x){
                if (temp.next == null){
                    temp = null;
                    return temp;
                }
                else temp.next = temp.next.next;
            }
            x++;
            temp = temp.next;
        }

        return reverse(reverseHead);
    }
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode nextt = head.next;
        nextt.next = head;
        head.next = null;
        return newHead;
    }
}