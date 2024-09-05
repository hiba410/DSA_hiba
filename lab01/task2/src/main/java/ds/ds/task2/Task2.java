/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ds.ds.task2;

/**
 *
 * @author User
 */
public class Task2 {

    public static void main(String[] args) {
       //exercise1  
        int[] num = new int[6];
    num[0] = 12;
    num[1] = 24;
    num[2] = 36;
    num[3] = 48;
    num[4] = 60;
        int element = 6;
    for(int i=num.length-1; i>0; i--){
   num[i] = num[i-1];
    }
      num[0] = element;
        System.out.println("Exercie 1:");
    for(int i = 0; i<num.length; i++){
    System.out.println(num[i]);
}
    //exercise2
    int[] num2 = new int[6];
    num2[0] = 100;
    num2[1] = 200;
    num2[2] = 300;
    num2[3] = 400;
    num2[4] = 500;
    
    int element2 = 250;
    int pos = 2;
     for(int i=num2.length-1; i>pos; i--){
   num2[i] = num2[i-1];
     }
     num2[pos] = element2;
       System.out.println("Exercie 2:");
     for(int i = 0; i<num2.length; i++){
    System.out.println(num2[i]);
}
     //exercise3
      int[] num3 = new int[6];
    num3[0] = 3;
    num3[1] = 6;
    num3[2] = 9;
    num3[3] = 12;
    num3[4] = 15;
    
     int element3 = 18;
    
     num3[num3.length - 1] = element3;
     System.out.println("Exercie 3:");
     for(int i = 0; i<num3.length; i++){
    System.out.println(num3[i]);
     }
}
}

