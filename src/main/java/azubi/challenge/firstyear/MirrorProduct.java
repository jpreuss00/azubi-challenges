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

    public static boolean TestProductForPalindrom(int factor1, int factor2) {

        String length = Integer.toString(factor1);
        String length2 = Integer.toString(factor2);
        Boolean corrector = false;

        if (length.length() == 3 && length2.length() == 3) {

            int product = (factor1 * factor2);
            String productAsString = Integer.toString(product);
            int counter = 0;

            for (int i = 0; i < product; i++) {
                product = (factor1 * factor2);
                productAsString = Integer.toString(product);
                for (int j = 1; j < productAsString.length(); j++) {
                    if (productAsString.charAt(j-1) == productAsString.charAt(productAsString.length() - j)) {
                        corrector = true;
                    } else {
                        corrector = false;
                        // erst bis counter == 10 abwechselnd runter, dann factor reseten und nur einen factor runter
                        if (factor1 > factor2) {
                            factor1--;
                            counter++;
                        } else {
                            factor2--;
                            counter++;
                        }
                        counter++;
                        break;
                    }
                }
                if (corrector == true) {
                    System.out.println(product);
                    System.out.println(counter);
                    return true;
                }
            }
        }
        return false;
    }
}