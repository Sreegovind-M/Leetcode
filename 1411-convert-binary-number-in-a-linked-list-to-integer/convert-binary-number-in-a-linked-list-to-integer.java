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
    public int getDecimalValue(ListNode head) {
        String num = "";
        ListNode temp = head;
        while (temp != null){
            num += String.valueOf(temp.val);
            temp = temp.next;
        }
        return Integer.parseInt(num, 2);
    }
}