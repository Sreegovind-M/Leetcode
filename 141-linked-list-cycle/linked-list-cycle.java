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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> li = new HashSet<>();

        ListNode temp = head;

        while (temp != null){
            if (li.contains(temp)){
                return true;
            }
            li.add(temp);
            temp = temp.next;
        }
        return false;
    }
}