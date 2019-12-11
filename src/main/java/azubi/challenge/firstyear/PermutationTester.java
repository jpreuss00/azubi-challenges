package main.java.azubi.challenge.firstyear;

public class PermutationTester {

    /**
     * isPermutationOfOther return true, when first is a permutation of second, 
     * false otherwise.
     * 
     * A permutation is an reordering of the characters.
     * 
     * @param first String
     * @param second String
     */
    public static boolean isPermutationOfOther(String first, String second) {
        if(first.isEmpty() && second.isEmpty()){
            return true;
        }

        int lengthfirst = first.length();
        int lengthsecond = second.length();

        for(int i = 0; i < lengthfirst; i++){
            if(i > 0){
                lengthsecond--;
            }
            if(first.charAt(i) == second.charAt(lengthsecond-1)){
                return true;
            }
        }
        return false;
    }
}