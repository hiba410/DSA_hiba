/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.binarytreee;

/**
 *
 * @author Hp
 */
public class BTnode {
    
    int data;
    BTnode left;
    BTnode right;
    
    public BTnode(int data){
        this.data = data;
        left = null;
        right = null;
    }
    
    public void addchildleft(BTnode parent, BTnode child){
        parent.left = child;
    }
     public void addchildright(BTnode parent, BTnode child){
        parent.right = child;
    }
}
