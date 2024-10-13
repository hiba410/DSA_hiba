/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.doublylinkedlist;

/**
 *
 * @author Hp
 */
public class DoublyLinkedList {

 public class Node{
        int data;
        Node next;
        Node prev;
        Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    
    public DoublyLinkedList(){
        this.head= null;
        this.head= null;
    }
    public void insertAtStart(int data){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
        }
        else {
            newNode. next = head;
            head. prev= newNode;
            head= newNode;
        }
    }
    public void insertAtEnd (int data){
        Node newNode = new Node (data);
        if (head == null){
            head= tail= newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev =tail;
            tail =newNode;
        }
    }

   public void addAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position. Position should be a non-negative integer.");
            return;
        }

        Node newNode = new Node(data);
        if (position == 0) {
            insertAtStart(data);
            return;
        }

        Node currentNode = head;
        int currentPosition = 0;
        while (currentNode != null && currentPosition < position - 1) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        if (currentNode == null) {
            System.out.println("Invalid position. Position exceeds the length of the list.");
            return;
        }

        if (currentNode == tail) {
            insertAtEnd(data);
            return;
        }

        newNode.next = currentNode.next;
        newNode.prev = currentNode;
        currentNode.next.prev = newNode;
        currentNode.next = newNode;
    }

   
   
     public void DeleteAtStart(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        head = head.next;
    }
      public void DeleteAtEnd(){
        if(tail == null){
            System.out.println("empty list");
            return;
    }
        tail = tail.prev;
        tail.next = null;
       
}
    
      public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete node.");
            return;
        }

        if (head.data == data) {
            DeleteAtStart();
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                if (currentNode.next == tail) {
                    DeleteAtEnd();
                } else {
                    currentNode.next = currentNode.next.next;
                    currentNode.next.prev = currentNode;
                }
                return;
            }
            currentNode = currentNode.next;
        }

        System.out.println("Node with value " + data + " not found in the list.");
    }
      
       public void displayfromstart(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+"->");
            current =current.next;
    }
        System.out.println("null"); 
    }
      
       public void displayFromEnd() {
        Node currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }
      
       
        public void search(int value) {
        Node currentNode = head;
        int position = 0;
        while (currentNode != null) {
            if (currentNode.data == value) {
                System.out.println("Value found at position " + position);
                return;
            }
            currentNode = currentNode.next;
            position++;
        }
        System.out.println("Value not found.");
    }
        
        public void reverse() {
           Node current = head;
    Node previous = null;

    while (current != null) {
        Node next = current.next;
        current.next = previous;
        current.prev = next;
        previous = current;
        current = next;
    }

    Node temp = head;
    head = tail;
    tail = temp;
}
        
      public int countNodes() {
    int count = 0;
    Node current = head;
    while (current != null) {
        count++; 
        current = current.next; 
    }
    return count;
}
        
    public static void main(String[] args){
    DoublyLinkedList dll = new DoublyLinkedList ();
        dll.insertAtStart(10);
        dll.insertAtStart(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.addAtPosition(50, 4);

        System.out.println("Display from start:");
        dll.displayfromstart();  

        System.out.println("Display from end:");
        dll.displayFromEnd();  

        dll.DeleteAtStart();
        System.out.println("Deleting from start:");
        dll.displayfromstart(); 

        dll.DeleteAtEnd();
        System.out.println("Deleting from end:");
        dll.displayfromstart(); 

        dll.deleteByValue(40);
        System.out.println("Deleting by value:");
        dll.displayfromstart();
        
        System.out.println("Searching by value:");
        dll.search(10);
        dll.displayfromstart();
        
        System.out.println("Reversing the list:");
        dll.reverse();
        dll.displayfromstart();

        System.out.println("Total nodes in the list: " +dll.countNodes());
        
    }
}    
    
    

