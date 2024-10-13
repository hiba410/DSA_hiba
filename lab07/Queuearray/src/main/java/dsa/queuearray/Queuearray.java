/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.queuearray;

/**
 *
 * @author Hp
 */
public class Queuearray {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queuearray(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = data;
        size++;
        System.out.println(data);
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int dequeueData = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            front = 0;
            rear = -1;
        }
        return dequeueData;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray[front];
    }


    public static void main(String[] args) {
        Queuearray q = new Queuearray(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeue: "+q.dequeue());
        System.out.println("Peek: "+q.peek());
       
    }
}