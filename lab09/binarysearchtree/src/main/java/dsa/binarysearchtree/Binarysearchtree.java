/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hp
 */
public class Binarysearchtree {
    
    
     BSTnode root;

    public Binarysearchtree() {
        this.root = null;
    }

    public void insertion(int value) {
    if (root == null) {
        root = new BSTnode(value);
        return;
    }

    BSTnode current = root;
    while (true) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new BSTnode(value);
                break;
            }
            current = current.left;
        } else if (value > current.value) {
            if (current.right == null) {
                current.right = new BSTnode(value);
                break;
            }
            current = current.right;
        } else {
            break; // Value already exists, no duplicates
        }
    }
}

    public void deletion(int value) {
        root = deleteNode(root, value);
    }

    private BSTnode deleteNode(BSTnode root, int value) {
        if (root == null) {
            return null; 
        }

        if (value < root.value) {
            root.left = deleteNode(root.left, value); 
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value); 
        } else {
            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            
            root.value = findMinValue(root.right);

            
            root.right = deleteNode(root.right, root.value);
        }

        return root;
    }

    private int findMinValue(BSTnode node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }
    
    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(BSTnode current) {
        if (current == null) {
            return 0;
        }
        return 1 + countNodesRec(current.left) + countNodesRec(current.right);
    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(BSTnode current, int value) {
        if (current == null) {
            return false; 
        }
        if (current.value == value) {
            return true; 
        }
        if (value < current.value) {
    return searchRec(current.left, value);
} else {
    return searchRec(current.right, value);
}
    }
 
        public void pre_order_traversal(BSTnode newNode) {
    if (newNode == null) {
        return;
    }
    System.out.print(" " + newNode.value); 
    pre_order_traversal(newNode.left); 
    pre_order_traversal(newNode.right); 
}
        
    public void in_order_traversal(BSTnode newNode) {
    if (newNode == null) {
        return;
    }
    in_order_traversal(newNode.left); 
    System.out.print(" " + newNode.value); 
    in_order_traversal(newNode.right); 
}
    
    public void post_order_traversal(BSTnode newNode) {
    if (newNode == null) {
        return;
    }
    post_order_traversal(newNode.left); 
    post_order_traversal(newNode.right); 
    System.out.print(" " + newNode.value); 
}
    
       public void level_order_traversal(BSTnode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

      
        Queue<BSTnode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BSTnode current = queue.poll(); 
            System.out.print(current.value + " "); 

            
            if (current.left != null) {
                queue.add(current.left);
            }

            
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        Binarysearchtree bst = new Binarysearchtree();

        bst.insertion(50);
        bst.insertion(30);
        bst.insertion(20);
        bst.insertion(40);
        bst.insertion(70);
        bst.insertion(60);
        bst.insertion(80);
        
        System.out.println("\nCount Nodes: ");
        System.out.println(bst.countNodes());
 
        System.out.println("In-order Traversal:");
        bst.in_order_traversal(bst.root);

        System.out.println("\nPre-order Traversal:");
        bst.pre_order_traversal(bst.root);

        System.out.println("\nPost-order Traversal:");
        bst.post_order_traversal(bst.root);
        
         System.out.println("\nLevel Order Traversal:");
        bst.level_order_traversal(bst.root);
        
        System.out.println("\nSearch Tests:");
        System.out.println(bst.search(20));
        
        System.out.println("Search Tests:");
        System.out.println(bst.search(60));
        
        System.out.println("Search Tests:");
        System.out.println(bst.search(90));
        
        bst.deletion(20);
        System.out.println("Level Order Traversal after deleting 20:");
        bst.level_order_traversal(bst.root); 
    }
}
 
    