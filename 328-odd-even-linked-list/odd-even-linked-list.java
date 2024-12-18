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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode odd_iterate = odd;
        ListNode even = new ListNode(-1);
        ListNode even_iterate = even;

        int i = 1;
        ListNode temp = head;

        while (temp != null){
            ListNode node = new ListNode(temp.val);
            if (i % 2 != 0){
                odd_iterate.next = node;
                odd_iterate = node;
            }
            else {
                even_iterate.next = node;
                even_iterate = node;
            }
            i++;
            temp = temp.next;
        }
        odd_iterate.next = even.next;
        return odd.next;
    }
}