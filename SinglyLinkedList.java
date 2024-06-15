public class SinglyLinkedList {

     private ListNode head;

     public static class ListNode {
         private int data;
         private ListNode next;

         public ListNode(int data){
             this.data=data;
             this.next=null;

         }
     }
     ListNode current = head;
     public void display(){
         
         while(current!=null){
             System.out.print(current.data +"->");
             current = current.next;

         }
         System.out.println("null");
     }
     public int length() {
         if(head == null)
         return 0;
         int count=0;
         ListNode current=head;
         while(current!=null) {
             count++;
             current=current.next;
         }
         return count;
     }
     public void insertFirst(int value) {
         ListNode newNode = new ListNode(value);
         newNode.next = head;
         head = newNode;
     }
     public void insertLast(int value) {
         ListNode newNode = new ListNode(value);
         if(head==null) {
             head = newNode; return; 
         }
         while(current.next!=null) {
             current = current.next;
         }
     }
     public static void main(String []args){
         SinglyLinkedList sll = new SinglyLinkedList();
         sll.head = new ListNode(10);
         ListNode second = new ListNode(1);
         ListNode third = new ListNode(8);
         ListNode fourth = new ListNode(11);
         sll.head.next=second;
         second.next=third;
         third.next= fourth;
         sll.display();
         System.out.println(sll.length());
         sll.insertFirst(11);
         sll.insertFirst(22);
         sll.display();
         sll.insertLast(20);
         sll.insertLast(18);
         sll.display();

     }
 }