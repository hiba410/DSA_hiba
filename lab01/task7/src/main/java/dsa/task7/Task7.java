/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsa.task7;

import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class Task7 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        if (str1.length() != str2.length()) {
            System.out.println("not anagram");
            return;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}
