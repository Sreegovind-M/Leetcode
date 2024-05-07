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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> st = new Stack<>();

        ListNode temp = head;
        while (temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode res_node = null;
        temp = res_node;
        int num = 0;
        int carry = 0;
        while (!st.empty()){
            num = (st.pop() * 2) + carry;
            carry = num / 10;

            ListNode node = new ListNode(num % 10);
            node.next = temp;
            temp = node;
        }

        if (carry > 0){
            ListNode node = new ListNode(carry);
            node.next = temp;
            temp = node;
        }


        return temp;
    }
}