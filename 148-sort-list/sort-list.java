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
    public ListNode sortList(ListNode head) {
        List<Integer> al = new ArrayList<>();

        if (head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        while (temp != null){
            al.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(al);

        ListNode my_head = new ListNode(al.get(0));

        temp = my_head;
        for (int i = 1; i < al.size(); i++){
            int num = al.get(i);

            ListNode next_add = new ListNode(num);

            temp.next = next_add;
            temp = next_add;
        }

        return my_head;
    }
}