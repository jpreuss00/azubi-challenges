package main.java.azubi.challenge.firstyear;

public class StringCompressor {

    /**
     * Für eine beliebigen String gebe die komprimierte Form zurück.
     * 
     * Komprimiert bedeutet, dass der Ausgabewert immer kleiner gleich dem
     * Eingangswert ist.
     *
     * Regeln: - kommt ein Buchstabe 'c' direkt hintereinander 'n' mal vor, dann
     * wird die Zeichenfolge durch 'c' 'n' abgekürzt: aaaa => a4, aabb => a2b2
     *
     * - kommt ein Buchstabe 'c' nur einmal vor, so wird der Buchstabe nicht
     * verkürzt: a => a, abc => abc
     * 
     * - ist der komprimierte string genauso lang wie die Eingabe, gebe die Eingabe
     * zurück
     * 
     * @return compressed string
     */
    public static String compress(String input) {

        int length = input.length();
        int counter = 1;
        String newString = "";

            for (int i = 0; i < length;) {
                counter = 1;
                for (int j = i + 1; j < length; j++) {
                    System.out.println("i="+i + ", j=" +j);

                        if (input.charAt(i) == input.charAt(j)) {
                            System.out.println("\tchars equal, counter increase to " + counter);
                            counter++;
                        } else {
                            System.out.println("\t chars not equal, exit");
                            break;
                        }
                }

                if (counter > 1) {
                    char newStringLetter = input.charAt(i);
                    newString = newString + newStringLetter + counter;
                    i = i + counter;
                    System.out.println("\tcounter > 1, counter =" + counter + ", newString =" + newString);
                } else {
                    char newStringLetter = input.charAt(i);
                    newString = newString + newStringLetter;
                    i++;
                    System.out.println("\tcounter <= 1, newString = " + newString);
                }
            }

        if (newString.length() == input.length()) {
            System.out.println("lengthequal input: " + input + ", newstring: " + newString);
            return input;
        } else {
            System.out.println("lengthequal not input: " + input + ", newstring: " + newString);
            return newString;
        }
    }
}