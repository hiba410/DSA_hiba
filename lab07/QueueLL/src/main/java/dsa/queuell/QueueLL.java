/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.queuell;

/**
 *
 * @author Hp
 */
public class QueueLL {
     public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
     private Node front;
     private Node rear;
     
     public QueueLL(){
         this.front=null;
         this .rear=null;
     }
     
     public void Enqueue(int data){
         Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear =  newNode;
         System.out.println(data);
     }
     
     public int Dequeue(){
         if (front == null){
             System.out.println("Queue is empty");
             front = rear = null;
             return -1;
         }
         int value = front.data;
         front = front.next;
         System.out.println("Dequeue: "+ value);
         return value;
     }
     public int peek() {
        if (front == null) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return front.data;
    }
     
    public static void main(String[] args) {
        QueueLL list = new QueueLL();
        
        list.Enqueue(10);
        list.Enqueue(20);
        list.Enqueue(30);
        list.Enqueue(40);
        list.Enqueue(50);
        list.Enqueue(60);
        list.Dequeue();
        System.out.println("Peek: " + list.peek());
    }
}
