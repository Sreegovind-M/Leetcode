class MyHashSet {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    int size;
    public MyHashSet() {
        head = null;
        size = 0;
    }
    
    public void add(int key) {
        if (size == 0){
            head = new Node(key);
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(key);
        size++;
        return;
    }
    
    public void remove(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            if (temp.next.data == key){
                temp.next = temp.next.next;
                size--;
            }
            else temp = temp.next;
        }
    }
    
    public boolean contains(int key) {
        if (head == null) return false;
        Node temp = head;
        while (temp != null){
            if (temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */