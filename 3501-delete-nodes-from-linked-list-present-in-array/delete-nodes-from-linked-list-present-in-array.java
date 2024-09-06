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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);

        ListNode temp = new ListNode();
        temp.next = head;
        ListNode curr = temp;
        ListNode prev = temp;

        while (curr != null){
            ListNode node = curr.next;

            if (set.contains(curr.val)){
                prev.next = node;
            }else{
                prev = curr;
            }
            curr = node;
        }
        return temp.next;
    }
}