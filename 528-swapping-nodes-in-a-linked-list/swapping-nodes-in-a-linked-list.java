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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = null;
        ListNode second = null;

        ListNode temp = head;
        ListNode temp2 = head;

        int ind = 1;
        while (temp != null){
            if (ind <= k){
                if (ind == k){
                    first = temp;
                }
                temp = temp.next;
            }
            else {
                temp = temp.next;
                temp2 = temp2.next;
            }
            ind++;
        }
        System.out.println(first.val + " " + temp2.val);
        second = temp2;
        int first_val = first.val;
        first.val = second.val;
        second.val = first_val;
        return head;
    }
}