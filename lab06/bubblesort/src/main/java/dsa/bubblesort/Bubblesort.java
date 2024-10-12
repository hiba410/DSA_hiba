/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package dsa.bubblesort;



/**
 *
 * @author Hp
 */
public class Bubblesort {
    public void bubblesort(int []arr){
  for (int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-1; j++){
          if(arr[j]>arr[j+1]){
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
          }
      }
  }
    }
  public static void earlyStopBubbleSort(int[] arr){
        boolean swapped = false;
        for(int i=0; i<arr.length-1; i++){
            swapped = false;
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(!swapped)
                    break;
            }
        }
    }
  public static void bubbleSortByLength(String[] array){
    for(int i=0; i<array.length-1; i++){
        for(int j = 0; j< array.length-i-1; j++){
            if(array[j].length() > array[j+1].length()){
                String temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    for(String str : array){
        System.out.print(str + " ");
    }
}
    public static void main(String[] args) {
        Bubblesort bs = new Bubblesort();
        int [] arr ={5,1,3,4,6,2};
         String[] fruits = {"apple", "pie", "banana", "cat"};
       bs.bubblesort(arr);
       System.out.println("Bubble Sort: ");
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println(" ");
        System.out.println("Optimized Bubble Sort with Early Stopping: ");
       bs.earlyStopBubbleSort(arr);
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
       } 
       System.out.println(" ");
       System.out.println("String Bubble Sort: ");
        bubbleSortByLength(fruits);
    }
}

