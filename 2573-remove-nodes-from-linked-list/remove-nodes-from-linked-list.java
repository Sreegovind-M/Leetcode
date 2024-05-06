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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;

        while (temp != null){
            while (!st.empty() && temp.val > st.peek().val){
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        ListNode new_node = new ListNode(-1);

        ListNode nxt = null;

        while (!st.empty()){
            temp = st.pop();
            temp.next = nxt;
            nxt = temp;
        }
        return temp;
    }
}