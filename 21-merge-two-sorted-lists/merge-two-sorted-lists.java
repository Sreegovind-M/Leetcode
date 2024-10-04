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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }
        else if (list1 == null && list2 != null){
            return list2;
        }
        else if (list1 != null && list2 == null){
            return list1;
        }
        else {
            ListNode res = new ListNode(0);
            ListNode temp1 = list1;
            ListNode temp2 = list2;
            ListNode iterate = res;

            while (temp1 != null && temp2 != null){
                ListNode node1 = temp1;
                ListNode node2 = temp2;
                if (temp1.val <= temp2.val){
                    iterate.next = node1;
                    iterate = node1;
                    temp1 = temp1.next;
                }
                else {
                    iterate.next = node2;
                    iterate = node2;
                    temp2 = temp2.next;
                }
            }
            if (temp1 != null){
                ListNode node = temp1;
                iterate.next = node;
                temp1 = temp1.next;
            }
            if (temp2 != null){
                ListNode node = temp2;
                iterate.next = node;
                temp2 = temp2.next;
            }
            return res.next;
        }
    }
}