package main.java.azubi.challenge.firstyear;

import java.util.Arrays;
import java.util.Objects;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class MirrorProduct {

    public static void main(String... args) {
        TestProductForPalindrom(9999, 9999);
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

        if (length.length() == 4 && length2.length() == 4) {

            int sum = (factor1 * factor2);
            String sumAsString = Integer.toString(sum);

            for (int i = 0; i < sum; i++) {
                sum = (factor1 * factor2);
                sumAsString = Integer.toString(sum);
                for (int j = 1; j < sumAsString.length(); j++) {
                    if (sumAsString.charAt(j) == sumAsString.charAt(sumAsString.length() - j)) {
                        corrector = true;
                    } else {
                        corrector = false;
                    }
                }
                if (corrector == false) {
                    if (factor1 > factor2) {
                        factor1--;
                    } else {
                        factor2--;
                    }
                } else if (corrector == true) {
                    System.out.println(sum);
                    return true;
                }
            }
        }
        return false;
    }
}