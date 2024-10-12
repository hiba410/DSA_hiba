/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.stackll;

/**
 *
 * @author Hp
 */
public class StackLL {
    
    public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
     Node top;
    
    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }
     
    public int pop(){
        if (top == null){
            System.out.println("Stack is empty!!");
            return -1;
        }
        else{
            int PoppedData = top.data;
            top = top.next;
            return PoppedData;
            
        }
       
    }
    
    public void peek(){
        if (top == null){
            System.out.println("Stack is Empty!!");
            return;
        }
            System.out.println("Top element is: "+ top.data);
    }
        
    
     public void isEmpty(){
         if(top == null){
             System.out.println("Stack is Empty!!");
             return;
         }
}
         
         public void size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            size++;
            current = current.next;
        }
        System.out.println("Size of the stack is: " + size);
    }
         

    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        System.out.println("Popped element: "+s.pop());
        s.peek();
        s.isEmpty();
        s.size();
        
        
    }
}

