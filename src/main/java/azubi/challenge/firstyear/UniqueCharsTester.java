package main.java.azubi.challenge.firstyear;

public class UniqueCharsTester {

    /**
     * hasUniqueChars returs true, when the given string consists only of 
     * unique chars, false otherwise
     * 
     * @param candidate given String to test
     */
    public static boolean hasUniqueChars(String candidate) {

            int x = candidate.length();

            for (int i = 0; i < x; i++){
                for(int j = i+1; j < x; j++){
                    if(candidate.charAt(i) == candidate.charAt(j)){
                        return false;
                    }
                }
            }
        return true;
    }
}