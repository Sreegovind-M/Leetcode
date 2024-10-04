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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];

        ListNode res = new ListNode(0);
        ListNode iterate = res;

        ListNode temp1 = lists[0];
        for (int i = 1; i < lists.length; i++){
            ListNode temp2 = lists[i];
            iterate = res;

            while (temp1 != null && temp2 != null){
                if (temp1.val <= temp2.val){
                    iterate.next = temp1;
                    iterate = temp1;
                    temp1 = temp1.next;
                }
                else {
                    iterate.next = temp2
                    ;
                    iterate = temp2;
                    temp2 = temp2.next;
                }
            }

            if (temp1 != null){
                iterate.next = temp1;
            }
            if (temp2 != null){
                iterate.next = temp2;
            }
            temp1 = res.next;
        }
        return res.next;
    }
}