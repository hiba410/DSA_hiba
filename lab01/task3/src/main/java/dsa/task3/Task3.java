/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.task3;

/**
 *
 * @author Hp
 */
public class Task3 {

    public static void main(String[] args) {
        int[] array={8,16,24,32,40};
        int deleteindex = 2;
        for(int i=deleteindex; i<array.length-1; i++){
            array[i]=array[i+1];
        }
        
        array[array.length-1]=0;
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
