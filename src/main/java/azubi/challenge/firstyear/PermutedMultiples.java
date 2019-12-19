package main.java.azubi.challenge.firstyear;

import java.util.Arrays;
import java.util.Objects;

public class PermutedMultiples {

    public static void main(String... args) {
        findSmallestPermutation();
    }

    /**
     * Given the positive number 125874 .. if you multiply that by 2 (which is
     * 251748) and compare both numbers you will notice that both share the same
     * digits, meaning they are permutations.
     * 
     * x = 125874 x2 = 251748 Permutation!
     * 
     * Find the smallest positive integer x, such that x2, x3, x4, x5 and x6 are all
     * permutations!!
     */
    public static void findSmallestPermutation() {

        boolean correctPermutation = false;
        String smallestInt = "";

        for (int i = 10; correctPermutation == false; i++) {
            smallestInt = Integer.toString(i);
            for (int j = 2; j < 7; j++) {
                int product = j * i;
                String productAsString = Integer.toString(product);
                Boolean isPermutation = PermutationTester.isPermutationOfOther(smallestInt, productAsString);
                if (isPermutation == true) {
                    System.out.println("output:" + product);
                } else {
                    break;
                }
                if (j == 6 && isPermutation == true) {
                    correctPermutation = true;
                }
            }
        }
        System.out.println(smallestInt);
    }
}