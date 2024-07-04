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
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode rest = res;

        ListNode temp = head;
        int adder = 0;
        while (temp.next != null){
            adder += temp.val;
            temp = temp.next;
            if (temp.val == 0){
                rest.next = new ListNode(adder);
                rest = rest.next;
                adder = 0;
            }
        }
        return res.next;
    }
}