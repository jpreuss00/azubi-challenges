package main.java.azubi.challenge.firstyear;

import java.util.Arrays;
import java.util.Objects;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class MirrorProduct {

    public static void main(String... args) {
        TestProductForPalindrom(999, 999);
    }

    /**
     * Prerequisite: A palindrome is a word that reads the same when reversed. Anna
     * reversed remains Anna, noon stays noon, Madam, Mom, radar, etc.
     * 
     * The same goes for numbers, 1001 can be mirrored, or 10801, 1 etc.
     * 
     * Task: We're looking for the largest product being a palindrome on condition
     * that the factors must have exactly 4 digits and the product must be the
     * largest of all 4 digit factors! The factors do *not* have to be palindromes
     * itself!!
     * 
     * Example: digits = 2 factor 1 = 91 // 2 digits, not a palindrome because it's
     * not required! factor 2 = 99 // 2 digits, coincidentally a palindrome but who
     * cares?! product = 9009 // palindrome and largest product of all 2 digit
     * factors!!
     * 
     * Example: digits = 4 factor 1 = 1001 // 4 digits factor 2 = 1001 // 4 digits
     * product = 1002001 // palindrome yes, but there are other factors resulting in
     * a larger product
     */

    

    /*public static boolean TestProductForPalindrom(int factor1, int factor2) {
      
    int product = (factor1 * factor2);
    String productAsString = Integer.toString(product);
    int counter1 = 0;
    int newFactor1 = factor1;
    int newFactor2 = factor2;
    int factor1Saver = factor1;
    int factor2Saver = factor2;
    int counter = 0; int highestPalindrome = 0;
      
    while (newFactor1 != 0){
        product = (newFactor1 * newFactor2);
        productAsString = Integer.toString(product);
        for (int j = 1; j < productAsString.length(); j++){
            if (productAsString.charAt(j - 1) == productAsString.charAt(productAsString.length() - j)) {
                if (highestPalindrome < product && j == productAsString.length() / 2){
                 highestPalindrome = product;
                }
            }
            else {
                counter++;
                break;
            }
        }
            System.out.println(newFactor1 + " * " + newFactor2 + " = " + product);
        {
          newFactor1 = factor1Saver;
          newFactor2 = factor2Saver;
          if (newFactor1 > newFactor2){ 
              newFactor1--; counter1++;
            } else { 
                newFactor2--; counter1++; }
      } else {
          factor1Saver = newFactor1;
          newFactor1 = newFactor1 + 1;
          factor2Saver = newFactor2;
          newFactor2 = factor2;
          newFactor1--; counter1 = 0;
        }
        if (newFactor1 == 0) {
            System.out.println("The highest Palindrome is " + highestPalindrome);
      System.out.println("Durchläufe: " + counter);
      return true;
    }
}
return false; }
*/
    public static boolean TestProductForPalindrom(int factor1, int factor2) {

    boolean corrector = false;
    int counter = 0;
    int highestPalindrome = 0;

    for(int i = factor1; i == 0; i--){
        for (int l = factor2; l == 0; l--) {
            int product = (i * l);
            String productAsString = Integer.toString(product);
            for (int j = 1; j < productAsString.length(); j++) {
                if (productAsString.charAt(j - 1) == productAsString.charAt(productAsString.length() - j)) {
                    corrector = true;
                } else {
                    corrector = false;
                    counter++;
                    break;
                }
            }
            if (corrector == true) {
                highestPalindrome = product;
            }
            System.out.println(i + " * " + l + " = " + product);
            if (highestPalindrome != 0) {
                System.out.println("The highest Palindrome is " + highestPalindrome);
                System.out.println("Durchläufe: " + counter);
                return true;
            }
        }
    }return false;
}}