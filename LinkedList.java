public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; 
        }

    }
    public static Node head;
    public static Node tail;
    //Methds
    public void addFirst(int data) {
        //step1 = create ne node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step2 newNode next = head
        newNode.next = head; //link

        //step3 
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void print() {
        if(head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
            
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}