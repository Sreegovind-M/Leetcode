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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null){
            return new int[]{-1, -1};
        }
        List<Integer> critp = new ArrayList<>();
        ListNode pre = head;
        ListNode curr = head.next;
        int pos = 1;
        while (curr.next != null){
            if ((curr.val > pre.val && curr.val > curr.next.val) ||
             (curr.val < pre.val && curr.val < curr.next.val)){
                critp.add(pos);
             }
             pre = curr;
             curr = curr.next;
             pos++;
        }
        if (critp.size() < 2){
            return new int[]{-1, -1};
        }
        int mind = Integer.MAX_VALUE;
        int maxd = critp.get(critp.size() - 1) - critp.get(0);

        for (int i = 1; i < critp.size(); i++){
            mind = Math.min(mind, critp.get(i) - critp.get(i - 1));
        }

        return new int[]{mind, maxd};
    }
}