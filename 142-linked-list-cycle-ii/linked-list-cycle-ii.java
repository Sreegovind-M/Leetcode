/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();

        if (head == null) return null;

        ListNode temp = head;
        while (temp.next != null){
            if (map.get(temp) != null){
                return temp;
            }
            map.put(temp, temp.val);
            temp = temp.next;
        }
        return null;
    }
}