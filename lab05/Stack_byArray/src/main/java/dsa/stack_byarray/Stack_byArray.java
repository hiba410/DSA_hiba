package dsa.stack_byarray;

public class Stack_byArray {
    
    
    public class Stack {
        private int[] stackArray;
        private int top;
        private int Size;

        
        public Stack(int size) {
            Size = size;
            stackArray = new int[Size];
            top = -1; 
        }

        
        public void push(int data) {
            if (top == Size - 1) {
                System.out.println("Stack overflow! Cannot push " + data);
            } else {
                stackArray[++top] = data; 
            }
        }

       
        public void peek() {
            if (!isEmpty()) {
                System.out.println("Top element is: "+ stackArray[top]);
            } else {
                System.out.println("Stack is empty!");
            }
        }

        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow! Nothing to pop.");
                return -1; 
            } else {
                return stackArray[top--];
            }
        }

        
        public boolean isEmpty() {
            return top == -1;
        }
        
        public void size() {
        System.out.println("Size of the stack is: " + (top + 1));
    }
    }
    
    
    public static void main(String[] args) {
        
        Stack_byArray.Stack stack = new Stack_byArray().new Stack(5);
        
        stack.push(10);
        stack.push(20);
        System.out.println("Popped element: "+stack.pop()); 
        stack.peek(); 
        System.out.println(stack.isEmpty()); 
        stack.size();
    }
}
