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
        ListNode res_head = new ListNode(0);
        res_head.next = head;
        ListNode iterate = res_head;
        ListNode curr = head;

        while (curr != null){
            boolean isDup = false;
            while (curr.next != null && curr.val == curr.next.val){
                isDup = true;
                curr = curr.next;
            }
            if (isDup){
                iterate.next = curr.next;
            }
            else {
                iterate = iterate.next;
            }
            curr = curr.next;
        }
        return res_head.next;
    }
}