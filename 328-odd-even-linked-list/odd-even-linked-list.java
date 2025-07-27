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
        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);

        ListNode t = head;
        ListNode oddTemp = oddHead;
        ListNode evenTemp = evenHead;
        int count = 1;
        while (t != null) {
            if (count % 2 == 0) {
                evenTemp.next = new ListNode(t.val);
                evenTemp = evenTemp.next;
            }
            else {
                oddTemp.next = new ListNode(t.val);
                oddTemp = oddTemp.next;
            }
            count++;
            t = t.next;
        }
        evenTemp.next = null;

        ListNode resHead = new ListNode(-1);
        ListNode temp = resHead;
        temp.next = oddHead.next;
        oddTemp.next = evenHead.next;

        
        // if (oddTemp != null) {
        //     temp.next = oddTemp;
        // }
        // if (evenTemp != null) {
        //     temp.next = evenTemp;
        // }
        display(resHead.next);
        return resHead.next;
    }
    public void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}