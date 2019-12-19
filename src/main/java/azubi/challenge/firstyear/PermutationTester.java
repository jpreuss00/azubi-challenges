package main.java.azubi.challenge.firstyear;

public class PermutationTester {

    /**
     * isPermutationOfOther return true, when first is a permutation of second,
     * false otherwise.
     * 
     * A permutation is an reordering of the characters.
     * 
     * @param first  String
     * @param second String
     */
    public static boolean isPermutationOfOther(String first, String second) {
        if (first.isEmpty() && second.isEmpty()) {
            return true;
        }

        if (first.length() != second.length()) {
            return false;
        }

        int lengthfirst = first.length();
        for (int i = 0; i < lengthfirst; i++) {
            char newTestCharLetter = first.charAt(i);
            second = deleteChar(newTestCharLetter, second);
        }
        if (second.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static String deleteChar(char newTestCharLetter, String second) {
        String newTestStringLetter = String.valueOf(newTestCharLetter);
        second = second.replaceFirst(newTestStringLetter, "");
        return second;
    }
}