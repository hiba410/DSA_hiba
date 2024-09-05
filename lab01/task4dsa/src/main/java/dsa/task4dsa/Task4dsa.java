/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.task4dsa;

/**
 *
 * @author Hp
 */
public class Task4dsa {

    public static void main(String[] args) {
       //Exercise 1
        int[] array={13,26,39,52,65};
        int index = 4;
        int element=array[index];
        System.out.println("Exercise 1:");
        System.out.println("Element at index "+index+": "+element);
     //Exercise 2
        int[] array2={4,6,2,8,10};
        int target = 8;
        boolean found = false;
        System.out.println("Exercise 2:");
        for(int i=0; i<array2.length; i++){
            if(array2[i]==target){
                System.out.println("Element "+target+" found at index "+i);
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("Element was not found");
        }
        //Exercise 3
        int[] array3={11,22,33,44,55};
        int target2 = 33;
        int left=0;
        int right=array3.length-1;
        int middle;
        boolean find = true;
        System.out.println("Exercise 3:");
        while (left<=right){
            middle=left+(right-left)/2;
            if(array3[middle]==target){
                System.out.println("Element  "+target+" at index: "+middle);
                find=true;
                break;
            }
            if(array3[middle]<target){
              left=middle+1;  
            }
            else{
                right=middle-1;
            }
        }
        if(find==false){
            System.out.println("Element was not found");
        }
        
    }
    }
   
