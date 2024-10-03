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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode ptr = head;
        ListNode curr = head;
        while (curr != null){
            if (ptr.val == curr.val){
                curr = curr.next;
            }
            else {
                ptr.next = curr;
                ptr = curr;
            }
        }
        ptr.next = null;
        return head;
    }
}