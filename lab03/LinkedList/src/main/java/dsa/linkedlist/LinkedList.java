/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.linkedlist;

/**
 *
 * @author Hp
 */
public class LinkedList {

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    private Node head;
    public LinkedList() { 
        this.head=null; 
    }
 
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next= head;
        head = newNode;
    }
   
    public void insertAtEnd(int data){
        Node newNode =new Node(data);
        if (head==null)
            head=newNode;
        else{
            Node current =head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
        }
    }
   
    public void insertAtPosition(int data, int position){
        if(position == 0){
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int index = 0;
        while(current!= null && index < position - 1){
            current = current.next;
            index++;
        }
        if(current == null){
            System.out.println("Position not in range");
        }
        else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

   
    public void deleteAtStart(){
        if(head == null){
            System.out.println("The List is empty");
        }
        head = head.next;
    }
   
    public void deleteAtEnd() {
        if (head == null)
            System.out.println("The List is empty");
        else if (head.next == null)
            head = null;
        else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }
   
    public void deleteByValue (int data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("The List is empty");
        }
        Node current = head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }   System.out.println("null");
    }
   
    public void Search(int value){
        Node current = head;
        int index = 0;
        while(current!= null){
            if(current.data == value){
                System.out.println("Value found at " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Value not found!");
    }

    public void Reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = null;
        Node current = head;
        Node next;
        while(current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void countNode() {
        if(head == null){
            System.out.println("The List is empty");
        }
        int count = 0;
        Node current = head;
        while (current != null){
            count++;
            current = current.next;
        }   System.out.println("this list contains " + count + " nodes");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(35);
        list.insertAtStart(30);
        list.insertAtStart(25);
        list.insertAtStart(20);
        list.insertAtStart(10);
        list.insertAtStart(5);
        list.insertAtEnd(40);
        list.insertAtPosition(15, 2);
        System.out.println("Inserting operations in list.");
        list.display();
        


        list.deleteAtStart();
        list.deleteAtEnd();
        list.deleteByValue(25);
         System.out.println("Deleting operation in list.");
        list.display();
        
        System.out.println("Traversal operation in list.");
        list.display();
       
        System.out.println("Searching operation in list.");
        list.Search(30);
        
        System.out.println("Reverse operation in list.");
        list.Reverse();
        list.display();
        
        System.out.println("Counting node operation in list.");
        list.countNode();
        
        
        
    }

}
