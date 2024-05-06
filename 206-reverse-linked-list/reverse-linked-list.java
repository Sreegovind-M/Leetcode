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
    public ListNode reverseList(ListNode head) {
        ListNode new_nodes = null;
        ListNode temp = head;

        while (temp != null){
            ListNode next_node = temp.next;
            temp.next = new_nodes;
            new_nodes = temp;
            temp = next_node;
        }
        return new_nodes;
    }
}