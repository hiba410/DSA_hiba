/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.binarytreee;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hp
 */
public class Binarytreee {

    BTnode root;
     Binarytreee(int data) {
        root = new BTnode(data);
    }
     
     public void pre_order_traversal(BTnode newNode){
         if(newNode == null){
             return;
         }
         System.out.print(" "+newNode.data);
         pre_order_traversal(newNode.left);
         pre_order_traversal(newNode.right);
     }    
    
     public void in_order_traversal(BTnode newNode){
         if(newNode == null){
             return;
         }
         in_order_traversal(newNode.left);
         System.out.print(" "+newNode.data);
         in_order_traversal(newNode.right);
     }    
     
     public void post_order_traversal(BTnode newNode){
         if(newNode == null){
             return;
         }
         post_order_traversal(newNode.left);
         post_order_traversal(newNode.right);
         System.out.print(" "+newNode.data);
     }    
     
      public void level_order_traversal(BTnode newNode){
          if (root == null) {
        return; 
    }
    Queue<BTnode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        BTnode current = queue.poll(); 
        System.out.print(current.data + " "); 

        if (current.left != null) {
            queue.add(current.left);
        }
        if (current.right != null) {
            queue.add(current.right);
        }
    }      
      }
    public static void main(String[] args) {
        Binarytreee bt = new Binarytreee(1);
        
        BTnode node2 = new BTnode(2);
        bt.root.addchildleft(bt.root, node2);
        
        BTnode node3 = new BTnode(3);
        bt.root.addchildright(bt.root, node3);
        
        BTnode node4 = new BTnode(4);
        node2.addchildleft(node2, node4);
        
        BTnode node5 = new BTnode(5);
        node3.addchildright(node3, node5);
        
        bt.pre_order_traversal(bt.root);
        System.out.println(" ");
        bt.in_order_traversal(bt.root);
        System.out.println(" ");
        bt.post_order_traversal(bt.root);
        System.out.println(" ");
        bt.level_order_traversal(bt.root);
        
    }
}
