/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) return null;

        Node res = new Node(head.val);
        Node iterate = res;
        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();
        map.put(temp, iterate);
        while (temp.next != null){
            iterate.next = new Node(temp.next.val);
            map.put(temp.next, iterate.next);
            temp = temp.next;
            iterate = iterate.next;
        }
        iterate = res;
        temp = head;

        while (temp != null){
            iterate.random = map.get(temp.random);
            iterate = iterate.next;
            temp = temp.next;
        }

        return res;
    }
}