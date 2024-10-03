class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node (int val){
            this.data = val;
            this.next = null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if (index >= size || index < 0 || head == null){
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = head;
        if (head == null){
            head = new Node(val);
            size++;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0){
            return;
        }

        if (index == 0){
            addAtHead(val);
            return;
        }
        if (index == size){
            addAtTail(val);
            return;
        }
        Node temp = head;

        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        Node next_node = temp.next;
        Node node = new Node(val);
        node.next = next_node;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size || head == null){
            return;
        }

        if (index == 0){
            deleteFirst();
            return;
        }
        if (index == size){
            deleteLast();
            return;
        }
        Node temp = head;

        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void deleteFirst(){
        Node second = head.next;
        head = second;
        size--;
    }
    public void deleteLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */