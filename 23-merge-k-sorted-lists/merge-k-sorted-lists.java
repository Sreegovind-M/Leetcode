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

        return find(lists, 0, lists.length - 1);
    }
    public ListNode find(ListNode lists[], int s, int e){
        if (s == e){
            return lists[s];
        }
        int mid = (s + e) / 2;
        ListNode left = find(lists, s, mid);
        ListNode right = find(lists, mid + 1, e);
        return merge(left, right);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode temp = res;

        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null){
            temp.next = l1;
        }
        if (l2 != null){
            temp.next = l2;
        }
        return res.next;
    }
}