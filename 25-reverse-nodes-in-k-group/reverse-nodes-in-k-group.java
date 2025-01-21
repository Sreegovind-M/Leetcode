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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode temp = head;
        
        while (temp != null){
            ListNode kthNode = findkthNode(temp, k);

            if (kthNode == null){
                if (prev != null){
                    prev.next = temp;
                }
                break;
            }

            ListNode nextGrpStart = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if (temp == head){
                head = kthNode;
            }
            else {
                prev.next = kthNode;
            }
            prev = temp;
            temp = nextGrpStart;
        }
        return head;
    }
    public ListNode findkthNode(ListNode temp, int k){
        int cnt = 1;
        while (temp != null && cnt != k){
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
    public void reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode nextt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
        }
    }
}