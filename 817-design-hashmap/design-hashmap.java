class MyHashMap {

    class Node{
        int k;
        int v;
        Node next;

        Node(int key, int data){
            this.k = key;
            this.v = data;
            this.next = null;
        }
    }
    Node head;
    int size;

    public MyHashMap() {
        head = null;
        size = 0;
    }
    
    public void put(int key, int value) {
        if (size == 0){
            head = new Node(key, value);
            size++;
            return;
        }
        Node temp = head;
        
        while (temp.next != null){
            if (temp.k == key){
                temp.v = value;
                return;
            }
            temp = temp.next;
        }
        if (temp.k == key){
            temp.v = value;
            return;
        }
        temp.next = new Node(key, value);
        size++;
        return;
    }
    
    public int get(int key) {
        if (size == 0 || head == null){
            return -1;
        }
        Node temp = head;
        while (temp != null){
            if (temp.k == key){
                return temp.v;
            }
            temp = temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        if (head == null || size == 0) {
            return;
        }
        if (head.k == key){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            if (temp.next.k == key){
                temp.next = temp.next.next;
                size--;
            }
            else temp = temp.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */